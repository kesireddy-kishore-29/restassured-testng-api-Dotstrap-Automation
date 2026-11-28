# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-c6d5ef69-3e3c-453c-993b-174e3927c38e` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-8cc45275-f055-4afa-b44d-18ed459b23ca` |
| 3 | `POST /v1/auth/token` | 200 | 8 | `qa-09218a6a-aafe-4764-9302-aeb98942720d` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-b52d935a-a3b7-469d-a805-c64db58cb5e3` |
| 5 | `POST /v1/credits/purchases` | 422 | 9 | `qa-925c2090-e624-4ee9-9e31-ec45e56096f7` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-2bd91bdc-0e76-47df-bc6b-a868c53f60c5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-9f92e24f-3436-4085-a286-b4edb23ee5fc` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-be70c137-534d-4bab-928c-f1bd624f2ce5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-17eae52b-5d66-498b-8004-3f3369b38a6e` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-8605def8-95e4-4661-9b0a-e4b9b0c2a1ca` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c6d5ef69-3e3c-453c-993b-174e3927c38e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6d5ef69-3e3c-453c-993b-174e3927c38e
Content-Type: application/json

--- request body ---
{"handle":"qa-d92116bd7931","displayName":"QA d92116bd7931","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6d5ef69-3e3c-453c-993b-174e3927c38e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 6
Location: /v1/accounts/qa-d92116bd7931
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b26fb247-f007-446a-a8de-90c2c4f9253a","handle":"qa-d92116bd7931","displayName":"QA d92116bd7931","region":"eu","role":"user","createdAt":"2026-11-27T11:00:00.134353661Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8cc45275-f055-4afa-b44d-18ed459b23ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cc45275-f055-4afa-b44d-18ed459b23ca
Content-Type: application/json

--- request body ---
{"handle":"qa-a2b966dbc2ba","displayName":"QA a2b966dbc2ba","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cc45275-f055-4afa-b44d-18ed459b23ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 6
Location: /v1/accounts/qa-a2b966dbc2ba
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20115ca4-3795-4a1d-84d0-51867de09060","handle":"qa-a2b966dbc2ba","displayName":"QA a2b966dbc2ba","region":"eu","role":"user","createdAt":"2026-11-27T11:00:00.157590147Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-09218a6a-aafe-4764-9302-aeb98942720d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09218a6a-aafe-4764-9302-aeb98942720d
Content-Type: application/json

--- request body ---
{"handle":"qa-d92116bd7931","password":"****"}

--- response: 200 in 8 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-09218a6a-aafe-4764-9302-aeb98942720d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b26fb247-f007-446a-a8de-90c2c4f9253a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b52d935a-a3b7-469d-a805-c64db58cb5e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b52d935a-a3b7-469d-a805-c64db58cb5e3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a2b966dbc2ba","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b52d935a-a3b7-469d-a805-c64db58cb5e3
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
Location: /v1/conversations/cnv_8a79e5b7-38cd-48bd-8ff6-276a610bcd4a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8a79e5b7-38cd-48bd-8ff6-276a610bcd4a","subject":"Error contract","status":"open","region":"eu","participants":["qa-d92116bd7931","qa-a2b966dbc2ba"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T11:00:00.188851822Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-925c2090-e624-4ee9-9e31-ec45e56096f7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-14a6f40cbc054f8ba656f34788179560
X-Correlation-Id: qa-925c2090-e624-4ee9-9e31-ec45e56096f7
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 9 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-925c2090-e624-4ee9-9e31-ec45e56096f7
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-925c2090-e624-4ee9-9e31-ec45e56096f7","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2bd91bdc-0e76-47df-bc6b-a868c53f60c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bd91bdc-0e76-47df-bc6b-a868c53f60c5
Content-Type: application/json

--- request body ---
{"handle":"qa-a2b966dbc2ba","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bd91bdc-0e76-47df-bc6b-a868c53f60c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20115ca4-3795-4a1d-84d0-51867de09060"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9f92e24f-3436-4085-a286-b4edb23ee5fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f92e24f-3436-4085-a286-b4edb23ee5fc
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9f92e24f-3436-4085-a286-b4edb23ee5fc
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
correlation: qa-be70c137-534d-4bab-928c-f1bd624f2ce5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be70c137-534d-4bab-928c-f1bd624f2ce5
Content-Type: application/json

--- request body ---
{"handle":"qa-a2b966dbc2ba","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be70c137-534d-4bab-928c-f1bd624f2ce5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-be70c137-534d-4bab-928c-f1bd624f2ce5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-17eae52b-5d66-498b-8004-3f3369b38a6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17eae52b-5d66-498b-8004-3f3369b38a6e
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-17eae52b-5d66-498b-8004-3f3369b38a6e
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
correlation: qa-8605def8-95e4-4661-9b0a-e4b9b0c2a1ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8605def8-95e4-4661-9b0a-e4b9b0c2a1ca
Content-Type: application/json

--- request body ---
{"handle":"qa-d92116bd7931","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8605def8-95e4-4661-9b0a-e4b9b0c2a1ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8605def8-95e4-4661-9b0a-e4b9b0c2a1ca"}
```
