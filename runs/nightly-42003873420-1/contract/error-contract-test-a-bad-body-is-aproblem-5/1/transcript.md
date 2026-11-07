# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-6f9ff808-342d-477a-84f2-cd471b1062df` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-75e29bed-fff1-4276-9be9-5115fcdc0047` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-f96408ff-a1b9-41fb-8fdd-6b3a0050b5b7` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-96e8275c-4ab4-4406-8d9b-ff573d687723` |
| 5 | `POST /v1/accounts` | 422 | 8 | `qa-4f4cb7d1-b39c-405b-99e1-7512c115659e` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-9a5ebd26-6914-4cf8-9307-c632e748fe7b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-704eda64-d834-4b38-801b-7f20a0c1a3b4` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-8402b849-1dc0-425f-a02f-5c6c179642c6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-c2346a82-5e18-4f91-9dcb-7d4bd9e59c50` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-6dfb8521-f84d-4146-af56-00999ec9ac7e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6f9ff808-342d-477a-84f2-cd471b1062df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f9ff808-342d-477a-84f2-cd471b1062df
Content-Type: application/json

--- request body ---
{"handle":"qa-63c2b72d7fc1","displayName":"QA 63c2b72d7fc1","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f9ff808-342d-477a-84f2-cd471b1062df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Location: /v1/accounts/qa-63c2b72d7fc1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_abab2d29-ab4f-4998-a453-84433d21bc59","handle":"qa-63c2b72d7fc1","displayName":"QA 63c2b72d7fc1","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.498172712Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-75e29bed-fff1-4276-9be9-5115fcdc0047

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75e29bed-fff1-4276-9be9-5115fcdc0047
Content-Type: application/json

--- request body ---
{"handle":"qa-6c44d3ec96ff","displayName":"QA 6c44d3ec96ff","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-75e29bed-fff1-4276-9be9-5115fcdc0047
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Location: /v1/accounts/qa-6c44d3ec96ff
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bbc7997c-8db9-4d13-9404-cc6b9c117f9f","handle":"qa-6c44d3ec96ff","displayName":"QA 6c44d3ec96ff","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.567823278Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f96408ff-a1b9-41fb-8fdd-6b3a0050b5b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f96408ff-a1b9-41fb-8fdd-6b3a0050b5b7
Content-Type: application/json

--- request body ---
{"handle":"qa-63c2b72d7fc1","password":"****"}

--- response: 200 in 43 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-f96408ff-a1b9-41fb-8fdd-6b3a0050b5b7
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_abab2d29-ab4f-4998-a453-84433d21bc59"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-96e8275c-4ab4-4406-8d9b-ff573d687723

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96e8275c-4ab4-4406-8d9b-ff573d687723
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6c44d3ec96ff","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-96e8275c-4ab4-4406-8d9b-ff573d687723
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
Location: /v1/conversations/cnv_dd8935dd-a0a9-4f33-9795-03f45b99b292
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_dd8935dd-a0a9-4f33-9795-03f45b99b292","subject":"Error contract","status":"open","region":"eu","participants":["qa-63c2b72d7fc1","qa-6c44d3ec96ff"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:55.654298572Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-4f4cb7d1-b39c-405b-99e1-7512c115659e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f4cb7d1-b39c-405b-99e1-7512c115659e
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f4cb7d1-b39c-405b-99e1-7512c115659e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 7
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-4f4cb7d1-b39c-405b-99e1-7512c115659e","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9a5ebd26-6914-4cf8-9307-c632e748fe7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a5ebd26-6914-4cf8-9307-c632e748fe7b
Content-Type: application/json

--- request body ---
{"handle":"qa-6c44d3ec96ff","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a5ebd26-6914-4cf8-9307-c632e748fe7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bbc7997c-8db9-4d13-9404-cc6b9c117f9f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-704eda64-d834-4b38-801b-7f20a0c1a3b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-704eda64-d834-4b38-801b-7f20a0c1a3b4
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-704eda64-d834-4b38-801b-7f20a0c1a3b4
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
correlation: qa-8402b849-1dc0-425f-a02f-5c6c179642c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8402b849-1dc0-425f-a02f-5c6c179642c6
Content-Type: application/json

--- request body ---
{"handle":"qa-6c44d3ec96ff","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8402b849-1dc0-425f-a02f-5c6c179642c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8402b849-1dc0-425f-a02f-5c6c179642c6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c2346a82-5e18-4f91-9dcb-7d4bd9e59c50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2346a82-5e18-4f91-9dcb-7d4bd9e59c50
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c2346a82-5e18-4f91-9dcb-7d4bd9e59c50
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
correlation: qa-6dfb8521-f84d-4146-af56-00999ec9ac7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dfb8521-f84d-4146-af56-00999ec9ac7e
Content-Type: application/json

--- request body ---
{"handle":"qa-63c2b72d7fc1","password":"****"}

--- response: 401 in 23 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6dfb8521-f84d-4146-af56-00999ec9ac7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6dfb8521-f84d-4146-af56-00999ec9ac7e"}
```
