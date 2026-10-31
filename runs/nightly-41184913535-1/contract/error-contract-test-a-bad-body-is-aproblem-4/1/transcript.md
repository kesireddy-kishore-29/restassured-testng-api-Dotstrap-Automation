# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-bf44b08b-29a9-4ef7-ba34-b772f8a1c148` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-226a48ac-55e7-432c-bf96-93baec4fe5cb` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-ae725d71-1cf9-4186-a047-935db548841d` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-35c004d8-c752-4fff-867b-61d497e51fce` |
| 5 | `POST /v1/accounts` | 415 | 34 | `qa-0aa45ca3-1665-413b-9398-862281102f67` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-66ee27ce-48c9-460d-8f70-cfc547302cbe` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-b05c4d8e-a8ae-4196-8605-5eb0a8d56eba` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-0f3979ce-46ee-478b-8117-8d1a74f0f13d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-fcccd0f6-711b-4ceb-9145-ab7a6952b9cc` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-425220f3-a7c2-47d3-8c98-a04fccab0431` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bf44b08b-29a9-4ef7-ba34-b772f8a1c148

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf44b08b-29a9-4ef7-ba34-b772f8a1c148
Content-Type: application/json

--- request body ---
{"handle":"qa-9dcf2c81d4a4","displayName":"QA 9dcf2c81d4a4","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf44b08b-29a9-4ef7-ba34-b772f8a1c148
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Location: /v1/accounts/qa-9dcf2c81d4a4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5cd0b454-91e1-42f4-80ea-a63992f85d24","handle":"qa-9dcf2c81d4a4","displayName":"QA 9dcf2c81d4a4","region":"eu","role":"user","createdAt":"2026-10-31T08:31:34.950895274Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-226a48ac-55e7-432c-bf96-93baec4fe5cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-226a48ac-55e7-432c-bf96-93baec4fe5cb
Content-Type: application/json

--- request body ---
{"handle":"qa-bef47d999012","displayName":"QA bef47d999012","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-226a48ac-55e7-432c-bf96-93baec4fe5cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Location: /v1/accounts/qa-bef47d999012
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0f8a27de-3c49-4d0d-b316-2ca82e86488a","handle":"qa-bef47d999012","displayName":"QA bef47d999012","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.041896371Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ae725d71-1cf9-4186-a047-935db548841d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae725d71-1cf9-4186-a047-935db548841d
Content-Type: application/json

--- request body ---
{"handle":"qa-9dcf2c81d4a4","password":"****"}

--- response: 200 in 50 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae725d71-1cf9-4186-a047-935db548841d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5cd0b454-91e1-42f4-80ea-a63992f85d24"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-35c004d8-c752-4fff-867b-61d497e51fce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35c004d8-c752-4fff-867b-61d497e51fce
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bef47d999012","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-35c004d8-c752-4fff-867b-61d497e51fce
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
Location: /v1/conversations/cnv_79fd7b96-0c33-41b2-a68e-6a23118b235f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_79fd7b96-0c33-41b2-a68e-6a23118b235f","subject":"Error contract","status":"open","region":"eu","participants":["qa-9dcf2c81d4a4","qa-bef47d999012"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.173342646Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-0aa45ca3-1665-413b-9398-862281102f67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0aa45ca3-1665-413b-9398-862281102f67
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 34 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0aa45ca3-1665-413b-9398-862281102f67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-0aa45ca3-1665-413b-9398-862281102f67"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-66ee27ce-48c9-460d-8f70-cfc547302cbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66ee27ce-48c9-460d-8f70-cfc547302cbe
Content-Type: application/json

--- request body ---
{"handle":"qa-bef47d999012","password":"****"}

--- response: 200 in 41 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-66ee27ce-48c9-460d-8f70-cfc547302cbe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f8a27de-3c49-4d0d-b316-2ca82e86488a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b05c4d8e-a8ae-4196-8605-5eb0a8d56eba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b05c4d8e-a8ae-4196-8605-5eb0a8d56eba
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b05c4d8e-a8ae-4196-8605-5eb0a8d56eba
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
correlation: qa-0f3979ce-46ee-478b-8117-8d1a74f0f13d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f3979ce-46ee-478b-8117-8d1a74f0f13d
Content-Type: application/json

--- request body ---
{"handle":"qa-bef47d999012","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f3979ce-46ee-478b-8117-8d1a74f0f13d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f3979ce-46ee-478b-8117-8d1a74f0f13d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fcccd0f6-711b-4ceb-9145-ab7a6952b9cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcccd0f6-711b-4ceb-9145-ab7a6952b9cc
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fcccd0f6-711b-4ceb-9145-ab7a6952b9cc
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
correlation: qa-425220f3-a7c2-47d3-8c98-a04fccab0431

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-425220f3-a7c2-47d3-8c98-a04fccab0431
Content-Type: application/json

--- request body ---
{"handle":"qa-9dcf2c81d4a4","password":"****"}

--- response: 401 in 27 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-425220f3-a7c2-47d3-8c98-a04fccab0431
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-425220f3-a7c2-47d3-8c98-a04fccab0431"}
```
