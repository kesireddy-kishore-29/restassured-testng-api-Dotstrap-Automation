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
| 1 | `POST /v1/accounts` | 201 | 377 | `qa-fc972dfb-8288-41dc-8849-47bbbadfcf96` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-980010de-fd23-4344-92f2-c758a0e34097` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-e3126f3c-3eeb-435e-a409-b731ae5b374f` |
| 4 | `POST /v1/conversations` | 201 | 50 | `qa-f0030f41-5049-4859-8038-6cfc64eb4f72` |
| 5 | `PATCH /v1/accounts/me` | 503 | 20 | `qa-e757370b-6992-481a-815d-7ddb34e03119` |
| 6 | `POST /v1/auth/token` | 200 | 45 | `qa-f1693ae5-544a-44d1-941f-16cfb5c88b30` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-a851b110-b45d-400a-9a6c-2916c679fdce` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-0bf2a864-5865-44a8-a063-b791109bdc3d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-d866741e-7fc4-4a83-8c1f-4fde557cc7ef` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-71e3f994-b6cf-4007-9e36-e936c975f59c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fc972dfb-8288-41dc-8849-47bbbadfcf96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc972dfb-8288-41dc-8849-47bbbadfcf96
Content-Type: application/json

--- request body ---
{"handle":"qa-b453fa8d814e","displayName":"QA b453fa8d814e","password":"****","region":"eu"}

--- response: 201 in 377 ms ---
Date: Tue, 03 Nov 2026 09:41:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc972dfb-8288-41dc-8849-47bbbadfcf96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Location: /v1/accounts/qa-b453fa8d814e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_082c1c05-7251-4b3e-9743-e9da30d8c5bb","handle":"qa-b453fa8d814e","displayName":"QA b453fa8d814e","region":"eu","role":"user","createdAt":"2026-11-03T09:41:30.879608767Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-980010de-fd23-4344-92f2-c758a0e34097

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-980010de-fd23-4344-92f2-c758a0e34097
Content-Type: application/json

--- request body ---
{"handle":"qa-5de9a94042cb","displayName":"QA 5de9a94042cb","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-980010de-fd23-4344-92f2-c758a0e34097
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-5de9a94042cb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f08761b3-fa5c-4b63-95dd-ce17214cf742","handle":"qa-5de9a94042cb","displayName":"QA 5de9a94042cb","region":"eu","role":"user","createdAt":"2026-11-03T09:41:31.216507349Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e3126f3c-3eeb-435e-a409-b731ae5b374f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3126f3c-3eeb-435e-a409-b731ae5b374f
Content-Type: application/json

--- request body ---
{"handle":"qa-b453fa8d814e","password":"****"}

--- response: 200 in 41 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3126f3c-3eeb-435e-a409-b731ae5b374f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_082c1c05-7251-4b3e-9743-e9da30d8c5bb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f0030f41-5049-4859-8038-6cfc64eb4f72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0030f41-5049-4859-8038-6cfc64eb4f72
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5de9a94042cb","subject":"Error contract","message":"Hi"}

--- response: 201 in 50 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0030f41-5049-4859-8038-6cfc64eb4f72
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
Location: /v1/conversations/cnv_25719f0b-ddaf-4c44-b1a4-37a77d481f0f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_25719f0b-ddaf-4c44-b1a4-37a77d481f0f","subject":"Error contract","status":"open","region":"eu","participants":["qa-b453fa8d814e","qa-5de9a94042cb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:31.397034934Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-e757370b-6992-481a-815d-7ddb34e03119

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 91700b24-bd11-405b-9c17-c45113f80a44
X-Correlation-Id: qa-e757370b-6992-481a-815d-7ddb34e03119
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e757370b-6992-481a-815d-7ddb34e03119
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-e757370b-6992-481a-815d-7ddb34e03119"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f1693ae5-544a-44d1-941f-16cfb5c88b30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1693ae5-544a-44d1-941f-16cfb5c88b30
Content-Type: application/json

--- request body ---
{"handle":"qa-5de9a94042cb","password":"****"}

--- response: 200 in 45 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1693ae5-544a-44d1-941f-16cfb5c88b30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f08761b3-fa5c-4b63-95dd-ce17214cf742"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a851b110-b45d-400a-9a6c-2916c679fdce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a851b110-b45d-400a-9a6c-2916c679fdce
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a851b110-b45d-400a-9a6c-2916c679fdce
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
correlation: qa-0bf2a864-5865-44a8-a063-b791109bdc3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bf2a864-5865-44a8-a063-b791109bdc3d
Content-Type: application/json

--- request body ---
{"handle":"qa-5de9a94042cb","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0bf2a864-5865-44a8-a063-b791109bdc3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0bf2a864-5865-44a8-a063-b791109bdc3d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d866741e-7fc4-4a83-8c1f-4fde557cc7ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d866741e-7fc4-4a83-8c1f-4fde557cc7ef
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d866741e-7fc4-4a83-8c1f-4fde557cc7ef
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
correlation: qa-71e3f994-b6cf-4007-9e36-e936c975f59c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71e3f994-b6cf-4007-9e36-e936c975f59c
Content-Type: application/json

--- request body ---
{"handle":"qa-b453fa8d814e","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71e3f994-b6cf-4007-9e36-e936c975f59c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71e3f994-b6cf-4007-9e36-e936c975f59c"}
```
