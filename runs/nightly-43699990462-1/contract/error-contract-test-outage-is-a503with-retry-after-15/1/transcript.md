# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 64 | `qa-1c0cba73-0c50-4b5a-8e67-ce59ae4c56ea` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-f6e82b4a-e5a9-4bf6-8bc6-50bc22fc359e` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-bb0f7494-900c-43b0-bdef-c77dc3c2b64e` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-e2a360f0-56cf-4af5-ab6d-fade65cae991` |
| 5 | `POST /v1/credits/purchases` | 503 | 13 | `qa-6d5dfa0c-6860-4f9e-bfde-c7f9a12e9dfc` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-ec55ee19-0cc5-4c78-a874-a471a2e94b31` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-f29e62f7-a47f-4bf4-8a54-da13b4241609` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-19e4db85-1097-40de-978d-38368d97abc8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-6f01374e-bb15-4cb5-a102-08d0040c84c6` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-667afd0d-ef63-41fa-858a-4799e6d47d00` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1c0cba73-0c50-4b5a-8e67-ce59ae4c56ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c0cba73-0c50-4b5a-8e67-ce59ae4c56ea
Content-Type: application/json

--- request body ---
{"handle":"qa-dc4507635bd0","displayName":"QA dc4507635bd0","password":"****","region":"eu"}

--- response: 201 in 64 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c0cba73-0c50-4b5a-8e67-ce59ae4c56ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 7
Location: /v1/accounts/qa-dc4507635bd0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f4ec5c66-cee6-4072-a14d-ca82a375c36f","handle":"qa-dc4507635bd0","displayName":"QA dc4507635bd0","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.445306191Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f6e82b4a-e5a9-4bf6-8bc6-50bc22fc359e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6e82b4a-e5a9-4bf6-8bc6-50bc22fc359e
Content-Type: application/json

--- request body ---
{"handle":"qa-6b0370a0ddc9","displayName":"QA 6b0370a0ddc9","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6e82b4a-e5a9-4bf6-8bc6-50bc22fc359e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 7
Location: /v1/accounts/qa-6b0370a0ddc9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0a467b1c-bd6a-4b2d-9daf-7875edee5eac","handle":"qa-6b0370a0ddc9","displayName":"QA 6b0370a0ddc9","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.508924290Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bb0f7494-900c-43b0-bdef-c77dc3c2b64e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb0f7494-900c-43b0-bdef-c77dc3c2b64e
Content-Type: application/json

--- request body ---
{"handle":"qa-dc4507635bd0","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb0f7494-900c-43b0-bdef-c77dc3c2b64e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f4ec5c66-cee6-4072-a14d-ca82a375c36f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e2a360f0-56cf-4af5-ab6d-fade65cae991

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2a360f0-56cf-4af5-ab6d-fade65cae991
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6b0370a0ddc9","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2a360f0-56cf-4af5-ab6d-fade65cae991
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_00182424-abef-4a4e-a553-01a271fefd86
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_00182424-abef-4a4e-a553-01a271fefd86","subject":"Error contract","status":"open","region":"eu","participants":["qa-dc4507635bd0","qa-6b0370a0ddc9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.555444817Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6d5dfa0c-6860-4f9e-bfde-c7f9a12e9dfc

--- request headers ---
Accept: application/json
X-Fault-Key: 9a784bf4-3db7-4f73-b3e5-34aa470ee030
Idempotency-Key: qa-94fa1f9ec8c74219a6e5a0e87d8d211a
X-Fault: unavailable-once
X-Correlation-Id: qa-6d5dfa0c-6860-4f9e-bfde-c7f9a12e9dfc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d5dfa0c-6860-4f9e-bfde-c7f9a12e9dfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-6d5dfa0c-6860-4f9e-bfde-c7f9a12e9dfc"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ec55ee19-0cc5-4c78-a874-a471a2e94b31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec55ee19-0cc5-4c78-a874-a471a2e94b31
Content-Type: application/json

--- request body ---
{"handle":"qa-6b0370a0ddc9","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec55ee19-0cc5-4c78-a874-a471a2e94b31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0a467b1c-bd6a-4b2d-9daf-7875edee5eac"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f29e62f7-a47f-4bf4-8a54-da13b4241609

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f29e62f7-a47f-4bf4-8a54-da13b4241609
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f29e62f7-a47f-4bf4-8a54-da13b4241609
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-19e4db85-1097-40de-978d-38368d97abc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19e4db85-1097-40de-978d-38368d97abc8
Content-Type: application/json

--- request body ---
{"handle":"qa-6b0370a0ddc9","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19e4db85-1097-40de-978d-38368d97abc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-19e4db85-1097-40de-978d-38368d97abc8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f01374e-bb15-4cb5-a102-08d0040c84c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f01374e-bb15-4cb5-a102-08d0040c84c6
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f01374e-bb15-4cb5-a102-08d0040c84c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-667afd0d-ef63-41fa-858a-4799e6d47d00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-667afd0d-ef63-41fa-858a-4799e6d47d00
Content-Type: application/json

--- request body ---
{"handle":"qa-dc4507635bd0","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-667afd0d-ef63-41fa-858a-4799e6d47d00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-667afd0d-ef63-41fa-858a-4799e6d47d00"}
```
