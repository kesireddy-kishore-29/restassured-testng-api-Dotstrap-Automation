# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-4e70cf58-aeea-4d10-8474-e4ab002e135a` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-5083e45a-b1e6-4e32-afe4-3b829db6229c` |
| 3 | `POST /v1/auth/token` | 200 | 8 | `qa-0b2046ba-bdbb-4432-b957-c92cb371c20f` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-e28095b7-76b1-44ec-82a0-49eafeeaf76b` |
| 5 | `POST /v1/credits/purchases` | 400 | 8 | `qa-708da3a2-0cf1-4ad1-b227-f54b111faf7e` |
| 6 | `POST /v1/auth/token` | 200 | 58 | `qa-1c798b47-a5ea-4243-a696-4856a37b0234` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-6da32226-273f-490d-9f63-f8807fd14155` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-864a2a0e-e7cb-4189-8a5b-b5a49da2f430` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-6e8a7181-4ef3-4485-b45c-88b762ca1d53` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-e4c1e29f-5f87-465c-a4a8-91111a1192b4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4e70cf58-aeea-4d10-8474-e4ab002e135a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e70cf58-aeea-4d10-8474-e4ab002e135a
Content-Type: application/json

--- request body ---
{"handle":"qa-fedbe64b8dd5","displayName":"QA fedbe64b8dd5","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e70cf58-aeea-4d10-8474-e4ab002e135a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 7
Location: /v1/accounts/qa-fedbe64b8dd5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_777179f7-f8e6-432b-8e5e-5870b4283a85","handle":"qa-fedbe64b8dd5","displayName":"QA fedbe64b8dd5","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.310934633Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5083e45a-b1e6-4e32-afe4-3b829db6229c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5083e45a-b1e6-4e32-afe4-3b829db6229c
Content-Type: application/json

--- request body ---
{"handle":"qa-7de9754c278a","displayName":"QA 7de9754c278a","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-5083e45a-b1e6-4e32-afe4-3b829db6229c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Location: /v1/accounts/qa-7de9754c278a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e18858c0-2be5-4b30-8858-9fb279ff5150","handle":"qa-7de9754c278a","displayName":"QA 7de9754c278a","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.342965818Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0b2046ba-bdbb-4432-b957-c92cb371c20f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b2046ba-bdbb-4432-b957-c92cb371c20f
Content-Type: application/json

--- request body ---
{"handle":"qa-fedbe64b8dd5","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b2046ba-bdbb-4432-b957-c92cb371c20f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_777179f7-f8e6-432b-8e5e-5870b4283a85"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e28095b7-76b1-44ec-82a0-49eafeeaf76b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e28095b7-76b1-44ec-82a0-49eafeeaf76b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7de9754c278a","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e28095b7-76b1-44ec-82a0-49eafeeaf76b
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
Location: /v1/conversations/cnv_025313ae-7d9e-4789-b1f2-d13da4b97de9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_025313ae-7d9e-4789-b1f2-d13da4b97de9","subject":"Error contract","status":"open","region":"eu","participants":["qa-fedbe64b8dd5","qa-7de9754c278a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.367370088Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-708da3a2-0cf1-4ad1-b227-f54b111faf7e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c10dc492e53f4d1ab6720d61d28c6397
X-Correlation-Id: qa-708da3a2-0cf1-4ad1-b227-f54b111faf7e
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-708da3a2-0cf1-4ad1-b227-f54b111faf7e
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-708da3a2-0cf1-4ad1-b227-f54b111faf7e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1c798b47-a5ea-4243-a696-4856a37b0234

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c798b47-a5ea-4243-a696-4856a37b0234
Content-Type: application/json

--- request body ---
{"handle":"qa-7de9754c278a","password":"****"}

--- response: 200 in 58 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c798b47-a5ea-4243-a696-4856a37b0234
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e18858c0-2be5-4b30-8858-9fb279ff5150"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6da32226-273f-490d-9f63-f8807fd14155

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6da32226-273f-490d-9f63-f8807fd14155
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6da32226-273f-490d-9f63-f8807fd14155
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
correlation: qa-864a2a0e-e7cb-4189-8a5b-b5a49da2f430

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-864a2a0e-e7cb-4189-8a5b-b5a49da2f430
Content-Type: application/json

--- request body ---
{"handle":"qa-7de9754c278a","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-864a2a0e-e7cb-4189-8a5b-b5a49da2f430
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-864a2a0e-e7cb-4189-8a5b-b5a49da2f430"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6e8a7181-4ef3-4485-b45c-88b762ca1d53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e8a7181-4ef3-4485-b45c-88b762ca1d53
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6e8a7181-4ef3-4485-b45c-88b762ca1d53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e4c1e29f-5f87-465c-a4a8-91111a1192b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4c1e29f-5f87-465c-a4a8-91111a1192b4
Content-Type: application/json

--- request body ---
{"handle":"qa-fedbe64b8dd5","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4c1e29f-5f87-465c-a4a8-91111a1192b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e4c1e29f-5f87-465c-a4a8-91111a1192b4"}
```
