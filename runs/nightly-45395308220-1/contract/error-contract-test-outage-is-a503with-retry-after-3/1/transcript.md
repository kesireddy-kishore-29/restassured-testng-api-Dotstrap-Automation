# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-e11d616a-e5ab-46d2-843b-1eee40c1e55b` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-ae9a6223-d709-4b0f-a693-540732d73dab` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-3300c992-f9ea-4b4c-81c6-ab0514816be2` |
| 4 | `POST /v1/conversations` | 201 | 36 | `qa-4b82a82d-2147-4a76-b2a5-4b6c6b5525b0` |
| 5 | `PATCH /v1/accounts/me` | 503 | 16 | `qa-f7e6cf73-9f3e-436f-9366-c1dce07b9380` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-df55f200-766c-4f9b-9de4-9160e808ff8e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-c27f3027-733f-40c5-9e53-804e6d39e871` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-590bab21-ad38-45c2-8d1c-5d5d0a2e0e87` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-86319a82-d78d-429b-b53c-af777c2c81c9` |
| 10 | `POST /v1/auth/token` | 401 | 31 | `qa-e0512ee9-8ea6-4052-88c7-420d7396de14` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e11d616a-e5ab-46d2-843b-1eee40c1e55b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e11d616a-e5ab-46d2-843b-1eee40c1e55b
Content-Type: application/json

--- request body ---
{"handle":"qa-300abf1e3c61","displayName":"QA 300abf1e3c61","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-e11d616a-e5ab-46d2-843b-1eee40c1e55b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-300abf1e3c61
X-Served-Region: eu
Content-Length: 181

{"id":"acc_34704b6b-3d75-4af0-8aec-642880c7576c","handle":"qa-300abf1e3c61","displayName":"QA 300abf1e3c61","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.144589369Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ae9a6223-d709-4b0f-a693-540732d73dab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae9a6223-d709-4b0f-a693-540732d73dab
Content-Type: application/json

--- request body ---
{"handle":"qa-d8a5cde35bcc","displayName":"QA d8a5cde35bcc","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae9a6223-d709-4b0f-a693-540732d73dab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-d8a5cde35bcc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_81cc3198-351c-46e4-abae-bf4df929284a","handle":"qa-d8a5cde35bcc","displayName":"QA d8a5cde35bcc","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.187578273Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3300c992-f9ea-4b4c-81c6-ab0514816be2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3300c992-f9ea-4b4c-81c6-ab0514816be2
Content-Type: application/json

--- request body ---
{"handle":"qa-300abf1e3c61","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-3300c992-f9ea-4b4c-81c6-ab0514816be2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_34704b6b-3d75-4af0-8aec-642880c7576c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4b82a82d-2147-4a76-b2a5-4b6c6b5525b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b82a82d-2147-4a76-b2a5-4b6c6b5525b0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d8a5cde35bcc","subject":"Error contract","message":"Hi"}

--- response: 201 in 36 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b82a82d-2147-4a76-b2a5-4b6c6b5525b0
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
Location: /v1/conversations/cnv_3cbb4792-d6e3-48ac-99e7-b7ef82c739fa
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3cbb4792-d6e3-48ac-99e7-b7ef82c739fa","subject":"Error contract","status":"open","region":"eu","participants":["qa-300abf1e3c61","qa-d8a5cde35bcc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:13.269909367Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-f7e6cf73-9f3e-436f-9366-c1dce07b9380

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 84df3028-3f5c-472c-bd4d-0957496dc02c
X-Correlation-Id: qa-f7e6cf73-9f3e-436f-9366-c1dce07b9380
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7e6cf73-9f3e-436f-9366-c1dce07b9380
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-f7e6cf73-9f3e-436f-9366-c1dce07b9380"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-df55f200-766c-4f9b-9de4-9160e808ff8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df55f200-766c-4f9b-9de4-9160e808ff8e
Content-Type: application/json

--- request body ---
{"handle":"qa-d8a5cde35bcc","password":"****"}

--- response: 200 in 40 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-df55f200-766c-4f9b-9de4-9160e808ff8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_81cc3198-351c-46e4-abae-bf4df929284a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c27f3027-733f-40c5-9e53-804e6d39e871

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c27f3027-733f-40c5-9e53-804e6d39e871
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c27f3027-733f-40c5-9e53-804e6d39e871
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
correlation: qa-590bab21-ad38-45c2-8d1c-5d5d0a2e0e87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-590bab21-ad38-45c2-8d1c-5d5d0a2e0e87
Content-Type: application/json

--- request body ---
{"handle":"qa-d8a5cde35bcc","password":"****"}

--- response: 401 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-590bab21-ad38-45c2-8d1c-5d5d0a2e0e87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-590bab21-ad38-45c2-8d1c-5d5d0a2e0e87"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-86319a82-d78d-429b-b53c-af777c2c81c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86319a82-d78d-429b-b53c-af777c2c81c9
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-86319a82-d78d-429b-b53c-af777c2c81c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e0512ee9-8ea6-4052-88c7-420d7396de14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0512ee9-8ea6-4052-88c7-420d7396de14
Content-Type: application/json

--- request body ---
{"handle":"qa-300abf1e3c61","password":"****"}

--- response: 401 in 31 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0512ee9-8ea6-4052-88c7-420d7396de14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e0512ee9-8ea6-4052-88c7-420d7396de14"}
```
