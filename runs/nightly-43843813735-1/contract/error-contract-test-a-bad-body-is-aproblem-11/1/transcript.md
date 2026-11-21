# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-400da1bb-f512-477a-af46-4334dec20f8e` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-323c72f7-93f3-4a40-b1b3-7ea04270beaa` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-1c460b13-cfa9-47e1-bb15-14d49f2f559e` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-9d03ac1c-ba2c-4d1b-82de-a152d2542a82` |
| 5 | `POST /v1/conversations` | 422 | 20 | `qa-13e98ce7-10fb-4c2a-9e50-4d3c5e6d4416` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-d74adc53-1897-49c1-9df2-a2faa2627389` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-84547d11-997a-4683-a66a-8cfd70cbec1b` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-4b1b3e6a-3597-497f-adbd-2f67716bba61` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-15cd9e46-5a01-48d9-9888-7e8717adfee5` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-d89d0e98-0629-434a-ab0b-09e357c13e81` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-400da1bb-f512-477a-af46-4334dec20f8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-400da1bb-f512-477a-af46-4334dec20f8e
Content-Type: application/json

--- request body ---
{"handle":"qa-5ac082380fe2","displayName":"QA 5ac082380fe2","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-400da1bb-f512-477a-af46-4334dec20f8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Location: /v1/accounts/qa-5ac082380fe2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bad0f27f-0f14-45ee-8521-480533d75ba7","handle":"qa-5ac082380fe2","displayName":"QA 5ac082380fe2","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.752828627Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-323c72f7-93f3-4a40-b1b3-7ea04270beaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-323c72f7-93f3-4a40-b1b3-7ea04270beaa
Content-Type: application/json

--- request body ---
{"handle":"qa-3d4f2c6c606e","displayName":"QA 3d4f2c6c606e","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-323c72f7-93f3-4a40-b1b3-7ea04270beaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Location: /v1/accounts/qa-3d4f2c6c606e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2f06f04b-4123-4976-84f2-2bf9d3efff20","handle":"qa-3d4f2c6c606e","displayName":"QA 3d4f2c6c606e","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.809438783Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1c460b13-cfa9-47e1-bb15-14d49f2f559e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c460b13-cfa9-47e1-bb15-14d49f2f559e
Content-Type: application/json

--- request body ---
{"handle":"qa-5ac082380fe2","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c460b13-cfa9-47e1-bb15-14d49f2f559e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bad0f27f-0f14-45ee-8521-480533d75ba7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9d03ac1c-ba2c-4d1b-82de-a152d2542a82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d03ac1c-ba2c-4d1b-82de-a152d2542a82
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3d4f2c6c606e","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d03ac1c-ba2c-4d1b-82de-a152d2542a82
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
Location: /v1/conversations/cnv_48307ba3-12a0-4a2c-9088-a3888f25f6c6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_48307ba3-12a0-4a2c-9088-a3888f25f6c6","subject":"Error contract","status":"open","region":"eu","participants":["qa-5ac082380fe2","qa-3d4f2c6c606e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.880561231Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-13e98ce7-10fb-4c2a-9e50-4d3c5e6d4416

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13e98ce7-10fb-4c2a-9e50-4d3c5e6d4416
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3d4f2c6c606e","subject":" ","message":"Hi"}

--- response: 422 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13e98ce7-10fb-4c2a-9e50-4d3c5e6d4416
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-13e98ce7-10fb-4c2a-9e50-4d3c5e6d4416","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d74adc53-1897-49c1-9df2-a2faa2627389

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d74adc53-1897-49c1-9df2-a2faa2627389
Content-Type: application/json

--- request body ---
{"handle":"qa-3d4f2c6c606e","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d74adc53-1897-49c1-9df2-a2faa2627389
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2f06f04b-4123-4976-84f2-2bf9d3efff20"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-84547d11-997a-4683-a66a-8cfd70cbec1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84547d11-997a-4683-a66a-8cfd70cbec1b
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-84547d11-997a-4683-a66a-8cfd70cbec1b
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
correlation: qa-4b1b3e6a-3597-497f-adbd-2f67716bba61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b1b3e6a-3597-497f-adbd-2f67716bba61
Content-Type: application/json

--- request body ---
{"handle":"qa-3d4f2c6c606e","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b1b3e6a-3597-497f-adbd-2f67716bba61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4b1b3e6a-3597-497f-adbd-2f67716bba61"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-15cd9e46-5a01-48d9-9888-7e8717adfee5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15cd9e46-5a01-48d9-9888-7e8717adfee5
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-15cd9e46-5a01-48d9-9888-7e8717adfee5
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
correlation: qa-d89d0e98-0629-434a-ab0b-09e357c13e81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d89d0e98-0629-434a-ab0b-09e357c13e81
Content-Type: application/json

--- request body ---
{"handle":"qa-5ac082380fe2","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d89d0e98-0629-434a-ab0b-09e357c13e81
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d89d0e98-0629-434a-ab0b-09e357c13e81"}
```
