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
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-93bcf8d2-9866-4456-a35a-9b34e1f9df5c` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-6fc90884-6779-40a3-9060-663df3edc80d` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-4451133b-8d8f-433b-9ea4-677531086496` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-56e53b50-2fe0-4694-8089-615bda8eadf9` |
| 5 | `PATCH /v1/accounts/me` | 415 | 13 | `qa-bd0987c0-bbe5-489c-a0df-09adcc368fb1` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-19f92a3a-d806-4985-b8f6-67dee4dbabd8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-afc3763d-2b97-4154-a216-2dbea7b90c16` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-5a7b98ee-5b7c-4b76-87b9-6d343e87e161` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-33a49ad3-d961-4433-aaf9-41ea1c3be311` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-474047af-74af-4fdc-932c-5b59bf86155d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-93bcf8d2-9866-4456-a35a-9b34e1f9df5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93bcf8d2-9866-4456-a35a-9b34e1f9df5c
Content-Type: application/json

--- request body ---
{"handle":"qa-ae9cb92e9c0e","displayName":"QA ae9cb92e9c0e","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-93bcf8d2-9866-4456-a35a-9b34e1f9df5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 9
Location: /v1/accounts/qa-ae9cb92e9c0e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f9d19a53-7832-4f9d-973d-92a944ed256c","handle":"qa-ae9cb92e9c0e","displayName":"QA ae9cb92e9c0e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.404395248Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6fc90884-6779-40a3-9060-663df3edc80d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fc90884-6779-40a3-9060-663df3edc80d
Content-Type: application/json

--- request body ---
{"handle":"qa-750120aa555f","displayName":"QA 750120aa555f","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-6fc90884-6779-40a3-9060-663df3edc80d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 9
Location: /v1/accounts/qa-750120aa555f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_24d4ff9d-9637-437a-869c-50637717a00e","handle":"qa-750120aa555f","displayName":"QA 750120aa555f","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.446966515Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4451133b-8d8f-433b-9ea4-677531086496

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4451133b-8d8f-433b-9ea4-677531086496
Content-Type: application/json

--- request body ---
{"handle":"qa-ae9cb92e9c0e","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-4451133b-8d8f-433b-9ea4-677531086496
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f9d19a53-7832-4f9d-973d-92a944ed256c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-56e53b50-2fe0-4694-8089-615bda8eadf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56e53b50-2fe0-4694-8089-615bda8eadf9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-750120aa555f","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-56e53b50-2fe0-4694-8089-615bda8eadf9
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
Location: /v1/conversations/cnv_384b57de-7fdd-4831-8e6d-cc9495f0c6bb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_384b57de-7fdd-4831-8e6d-cc9495f0c6bb","subject":"Error contract","status":"open","region":"eu","participants":["qa-ae9cb92e9c0e","qa-750120aa555f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.525563020Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-bd0987c0-bbe5-489c-a0df-09adcc368fb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd0987c0-bbe5-489c-a0df-09adcc368fb1
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd0987c0-bbe5-489c-a0df-09adcc368fb1
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-bd0987c0-bbe5-489c-a0df-09adcc368fb1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-19f92a3a-d806-4985-b8f6-67dee4dbabd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19f92a3a-d806-4985-b8f6-67dee4dbabd8
Content-Type: application/json

--- request body ---
{"handle":"qa-750120aa555f","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-19f92a3a-d806-4985-b8f6-67dee4dbabd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24d4ff9d-9637-437a-869c-50637717a00e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-afc3763d-2b97-4154-a216-2dbea7b90c16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afc3763d-2b97-4154-a216-2dbea7b90c16
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-afc3763d-2b97-4154-a216-2dbea7b90c16
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
correlation: qa-5a7b98ee-5b7c-4b76-87b9-6d343e87e161

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a7b98ee-5b7c-4b76-87b9-6d343e87e161
Content-Type: application/json

--- request body ---
{"handle":"qa-750120aa555f","password":"****"}

--- response: 401 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a7b98ee-5b7c-4b76-87b9-6d343e87e161
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5a7b98ee-5b7c-4b76-87b9-6d343e87e161"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-33a49ad3-d961-4433-aaf9-41ea1c3be311

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33a49ad3-d961-4433-aaf9-41ea1c3be311
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-33a49ad3-d961-4433-aaf9-41ea1c3be311
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
correlation: qa-474047af-74af-4fdc-932c-5b59bf86155d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-474047af-74af-4fdc-932c-5b59bf86155d
Content-Type: application/json

--- request body ---
{"handle":"qa-ae9cb92e9c0e","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-474047af-74af-4fdc-932c-5b59bf86155d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-474047af-74af-4fdc-932c-5b59bf86155d"}
```
