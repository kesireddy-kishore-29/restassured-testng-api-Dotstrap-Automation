# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 75 | `qa-2b7edc92-fd58-4694-8d7d-9798594b1ea1` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-f91c8e70-6978-4695-bd12-49fe911ba1d8` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-e7c4537a-1ee5-4117-8426-f68754eed46f` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-5990a5da-7f7d-4306-aef7-70c854594962` |
| 5 | `PATCH /v1/accounts/me` | 415 | 18 | `qa-b533096f-57c5-455d-9034-b845c50b5d18` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-d4cad37e-20db-4055-927e-bd09425f645d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-7705dd1f-1e69-44b7-9a87-2e8c490cdb8e` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-b58e1e21-53aa-4ba4-b239-07d516a9192e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-819ecc4f-afb3-4d66-a825-99fdce27a922` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-b4934383-1574-4b5f-ab4a-f22a46672831` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2b7edc92-fd58-4694-8d7d-9798594b1ea1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b7edc92-fd58-4694-8d7d-9798594b1ea1
Content-Type: application/json

--- request body ---
{"handle":"qa-b54ed61c95cf","displayName":"QA b54ed61c95cf","password":"****","region":"eu"}

--- response: 201 in 75 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b7edc92-fd58-4694-8d7d-9798594b1ea1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Location: /v1/accounts/qa-b54ed61c95cf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c58327e1-073b-4942-b29e-b5f5097573db","handle":"qa-b54ed61c95cf","displayName":"QA b54ed61c95cf","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.313792216Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f91c8e70-6978-4695-bd12-49fe911ba1d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f91c8e70-6978-4695-bd12-49fe911ba1d8
Content-Type: application/json

--- request body ---
{"handle":"qa-6645a83b9a45","displayName":"QA 6645a83b9a45","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-f91c8e70-6978-4695-bd12-49fe911ba1d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 7
Location: /v1/accounts/qa-6645a83b9a45
X-Served-Region: eu
Content-Length: 181

{"id":"acc_28c7ce85-b3aa-4d5d-a72e-56bc59790dc5","handle":"qa-6645a83b9a45","displayName":"QA 6645a83b9a45","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.380971864Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e7c4537a-1ee5-4117-8426-f68754eed46f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7c4537a-1ee5-4117-8426-f68754eed46f
Content-Type: application/json

--- request body ---
{"handle":"qa-b54ed61c95cf","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7c4537a-1ee5-4117-8426-f68754eed46f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c58327e1-073b-4942-b29e-b5f5097573db"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5990a5da-7f7d-4306-aef7-70c854594962

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5990a5da-7f7d-4306-aef7-70c854594962
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6645a83b9a45","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-5990a5da-7f7d-4306-aef7-70c854594962
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
Location: /v1/conversations/cnv_98fed3ae-b465-4c89-903b-0f55b7589f22
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_98fed3ae-b465-4c89-903b-0f55b7589f22","subject":"Error contract","status":"open","region":"eu","participants":["qa-b54ed61c95cf","qa-6645a83b9a45"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:45.458982111Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-b533096f-57c5-455d-9034-b845c50b5d18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b533096f-57c5-455d-9034-b845c50b5d18
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b533096f-57c5-455d-9034-b845c50b5d18
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-b533096f-57c5-455d-9034-b845c50b5d18"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d4cad37e-20db-4055-927e-bd09425f645d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4cad37e-20db-4055-927e-bd09425f645d
Content-Type: application/json

--- request body ---
{"handle":"qa-6645a83b9a45","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4cad37e-20db-4055-927e-bd09425f645d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_28c7ce85-b3aa-4d5d-a72e-56bc59790dc5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7705dd1f-1e69-44b7-9a87-2e8c490cdb8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7705dd1f-1e69-44b7-9a87-2e8c490cdb8e
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7705dd1f-1e69-44b7-9a87-2e8c490cdb8e
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
correlation: qa-b58e1e21-53aa-4ba4-b239-07d516a9192e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b58e1e21-53aa-4ba4-b239-07d516a9192e
Content-Type: application/json

--- request body ---
{"handle":"qa-6645a83b9a45","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b58e1e21-53aa-4ba4-b239-07d516a9192e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b58e1e21-53aa-4ba4-b239-07d516a9192e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-819ecc4f-afb3-4d66-a825-99fdce27a922

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-819ecc4f-afb3-4d66-a825-99fdce27a922
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-819ecc4f-afb3-4d66-a825-99fdce27a922
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
correlation: qa-b4934383-1574-4b5f-ab4a-f22a46672831

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4934383-1574-4b5f-ab4a-f22a46672831
Content-Type: application/json

--- request body ---
{"handle":"qa-b54ed61c95cf","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4934383-1574-4b5f-ab4a-f22a46672831
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b4934383-1574-4b5f-ab4a-f22a46672831"}
```
