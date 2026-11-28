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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-61d6c930-8962-47b5-9dce-d44146615520` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-baa1eb9a-603e-4a9e-958a-3e7f808947d0` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-d1f16e26-0f27-41a3-9d81-42d84c2402ef` |
| 4 | `POST /v1/conversations` | 201 | 4 | `qa-a73f7075-097a-40c5-91d1-6c8c796fe368` |
| 5 | `POST /v1/credits/purchases` | 422 | 9 | `qa-1df6a9fc-f587-47c7-9940-2a3cb1ff6fd4` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-9b2d8d71-3ab8-42eb-b6f1-3bd88d14ccf0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-7c895a3a-0574-40c6-adf8-c493861f755a` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-d5be2249-19de-4175-af5c-5706e064622b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-33958d06-5897-418a-b39a-e3ab14aaa674` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-06ff3268-33c1-46ff-bcd3-3ffd2a55f02a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-61d6c930-8962-47b5-9dce-d44146615520

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61d6c930-8962-47b5-9dce-d44146615520
Content-Type: application/json

--- request body ---
{"handle":"qa-11e0fbee69bf","displayName":"QA 11e0fbee69bf","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-61d6c930-8962-47b5-9dce-d44146615520
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 6
Location: /v1/accounts/qa-11e0fbee69bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb6f1a32-32be-4a95-9fe7-f05780fb49e3","handle":"qa-11e0fbee69bf","displayName":"QA 11e0fbee69bf","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.894740835Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-baa1eb9a-603e-4a9e-958a-3e7f808947d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baa1eb9a-603e-4a9e-958a-3e7f808947d0
Content-Type: application/json

--- request body ---
{"handle":"qa-1cc3d8baf521","displayName":"QA 1cc3d8baf521","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-baa1eb9a-603e-4a9e-958a-3e7f808947d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 6
Location: /v1/accounts/qa-1cc3d8baf521
X-Served-Region: eu
Content-Length: 181

{"id":"acc_163df2c6-e5cc-457e-9495-26fd970295a3","handle":"qa-1cc3d8baf521","displayName":"QA 1cc3d8baf521","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.928434582Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d1f16e26-0f27-41a3-9d81-42d84c2402ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1f16e26-0f27-41a3-9d81-42d84c2402ef
Content-Type: application/json

--- request body ---
{"handle":"qa-11e0fbee69bf","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1f16e26-0f27-41a3-9d81-42d84c2402ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb6f1a32-32be-4a95-9fe7-f05780fb49e3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a73f7075-097a-40c5-91d1-6c8c796fe368

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a73f7075-097a-40c5-91d1-6c8c796fe368
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1cc3d8baf521","subject":"Error contract","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-a73f7075-097a-40c5-91d1-6c8c796fe368
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
Location: /v1/conversations/cnv_6b365b7a-1ed7-41d9-b5c1-6dd9836bd3eb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6b365b7a-1ed7-41d9-b5c1-6dd9836bd3eb","subject":"Error contract","status":"open","region":"eu","participants":["qa-11e0fbee69bf","qa-1cc3d8baf521"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.965577933Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1df6a9fc-f587-47c7-9940-2a3cb1ff6fd4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b9525340e51341b9951ca6d0184e940e
X-Correlation-Id: qa-1df6a9fc-f587-47c7-9940-2a3cb1ff6fd4
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1df6a9fc-f587-47c7-9940-2a3cb1ff6fd4
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-1df6a9fc-f587-47c7-9940-2a3cb1ff6fd4","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9b2d8d71-3ab8-42eb-b6f1-3bd88d14ccf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b2d8d71-3ab8-42eb-b6f1-3bd88d14ccf0
Content-Type: application/json

--- request body ---
{"handle":"qa-1cc3d8baf521","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b2d8d71-3ab8-42eb-b6f1-3bd88d14ccf0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_163df2c6-e5cc-457e-9495-26fd970295a3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7c895a3a-0574-40c6-adf8-c493861f755a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c895a3a-0574-40c6-adf8-c493861f755a
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7c895a3a-0574-40c6-adf8-c493861f755a
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
correlation: qa-d5be2249-19de-4175-af5c-5706e064622b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5be2249-19de-4175-af5c-5706e064622b
Content-Type: application/json

--- request body ---
{"handle":"qa-1cc3d8baf521","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5be2249-19de-4175-af5c-5706e064622b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d5be2249-19de-4175-af5c-5706e064622b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-33958d06-5897-418a-b39a-e3ab14aaa674

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33958d06-5897-418a-b39a-e3ab14aaa674
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-33958d06-5897-418a-b39a-e3ab14aaa674
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
correlation: qa-06ff3268-33c1-46ff-bcd3-3ffd2a55f02a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06ff3268-33c1-46ff-bcd3-3ffd2a55f02a
Content-Type: application/json

--- request body ---
{"handle":"qa-11e0fbee69bf","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-06ff3268-33c1-46ff-bcd3-3ffd2a55f02a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-06ff3268-33c1-46ff-bcd3-3ffd2a55f02a"}
```
