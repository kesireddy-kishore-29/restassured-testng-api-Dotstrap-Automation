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
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-9e3ef343-94ac-426d-a6b3-56aa0aea193a` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-a75f9733-611f-49db-855d-57fd9cb067ee` |
| 3 | `POST /v1/auth/token` | 200 | 48 | `qa-555f02cc-098b-4743-a691-b79974f6165c` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-a16fed4a-3aa2-48e2-8ae8-1e91281bdaf5` |
| 5 | `POST /v1/accounts` | 422 | 28 | `qa-4f63c4ea-9e68-4959-bd65-1399c3d730d8` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-c239c72c-a81f-4621-8f7f-4ce4665a081b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-72203c40-3fcc-42b4-b1f5-4fef8631b161` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-7d988057-f923-4523-bf46-99ee4d409166` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-8a1b0b9a-28c9-4bcd-9f00-dbb8dafc557e` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-cea6f78e-f469-4e45-8b46-83be94e0408b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9e3ef343-94ac-426d-a6b3-56aa0aea193a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e3ef343-94ac-426d-a6b3-56aa0aea193a
Content-Type: application/json

--- request body ---
{"handle":"qa-f6ea5fba9294","displayName":"QA f6ea5fba9294","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e3ef343-94ac-426d-a6b3-56aa0aea193a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Location: /v1/accounts/qa-f6ea5fba9294
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5f087a6a-4466-4e76-9903-d68e97d34e17","handle":"qa-f6ea5fba9294","displayName":"QA f6ea5fba9294","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.982635215Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a75f9733-611f-49db-855d-57fd9cb067ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a75f9733-611f-49db-855d-57fd9cb067ee
Content-Type: application/json

--- request body ---
{"handle":"qa-9f54138a6c71","displayName":"QA 9f54138a6c71","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a75f9733-611f-49db-855d-57fd9cb067ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 7
Location: /v1/accounts/qa-9f54138a6c71
X-Served-Region: eu
Content-Length: 181

{"id":"acc_168ceb06-6b94-47e6-ac6d-fc7f33a3adb2","handle":"qa-9f54138a6c71","displayName":"QA 9f54138a6c71","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.046618390Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-555f02cc-098b-4743-a691-b79974f6165c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-555f02cc-098b-4743-a691-b79974f6165c
Content-Type: application/json

--- request body ---
{"handle":"qa-f6ea5fba9294","password":"****"}

--- response: 200 in 48 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-555f02cc-098b-4743-a691-b79974f6165c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5f087a6a-4466-4e76-9903-d68e97d34e17"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a16fed4a-3aa2-48e2-8ae8-1e91281bdaf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a16fed4a-3aa2-48e2-8ae8-1e91281bdaf5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9f54138a6c71","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a16fed4a-3aa2-48e2-8ae8-1e91281bdaf5
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
Location: /v1/conversations/cnv_2a349127-e741-40f7-b65d-37cfd462f92f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2a349127-e741-40f7-b65d-37cfd462f92f","subject":"Error contract","status":"open","region":"eu","participants":["qa-f6ea5fba9294","qa-9f54138a6c71"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.159364675Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-4f63c4ea-9e68-4959-bd65-1399c3d730d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f63c4ea-9e68-4959-bd65-1399c3d730d8
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f63c4ea-9e68-4959-bd65-1399c3d730d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 7
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-4f63c4ea-9e68-4959-bd65-1399c3d730d8","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c239c72c-a81f-4621-8f7f-4ce4665a081b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c239c72c-a81f-4621-8f7f-4ce4665a081b
Content-Type: application/json

--- request body ---
{"handle":"qa-9f54138a6c71","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c239c72c-a81f-4621-8f7f-4ce4665a081b
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_168ceb06-6b94-47e6-ac6d-fc7f33a3adb2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-72203c40-3fcc-42b4-b1f5-4fef8631b161

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72203c40-3fcc-42b4-b1f5-4fef8631b161
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-72203c40-3fcc-42b4-b1f5-4fef8631b161
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
correlation: qa-7d988057-f923-4523-bf46-99ee4d409166

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d988057-f923-4523-bf46-99ee4d409166
Content-Type: application/json

--- request body ---
{"handle":"qa-9f54138a6c71","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d988057-f923-4523-bf46-99ee4d409166
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7d988057-f923-4523-bf46-99ee4d409166"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8a1b0b9a-28c9-4bcd-9f00-dbb8dafc557e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a1b0b9a-28c9-4bcd-9f00-dbb8dafc557e
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8a1b0b9a-28c9-4bcd-9f00-dbb8dafc557e
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
correlation: qa-cea6f78e-f469-4e45-8b46-83be94e0408b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cea6f78e-f469-4e45-8b46-83be94e0408b
Content-Type: application/json

--- request body ---
{"handle":"qa-f6ea5fba9294","password":"****"}

--- response: 401 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cea6f78e-f469-4e45-8b46-83be94e0408b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cea6f78e-f469-4e45-8b46-83be94e0408b"}
```
