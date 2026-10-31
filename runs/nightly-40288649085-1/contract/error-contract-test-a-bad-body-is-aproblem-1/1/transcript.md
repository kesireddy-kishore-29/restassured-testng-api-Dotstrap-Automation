# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-c4cd3332-1945-45ae-b100-82a0a2617f0a` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-7e2cc3e6-ec6c-47b9-b975-22376d82689f` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-09a4f89a-d5f1-4635-807e-17f4cbaa783c` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-cea8df3b-16c7-449b-97ac-9f93838fafac` |
| 5 | `POST /v1/auth/token` | 415 | 19 | `qa-441f65d4-05b6-49c0-83c8-fc7a1923c4c4` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-f4712eaa-7a6c-4d0f-b4ca-84b1c3fef615` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-1d668792-b7cc-48d8-bfda-de2e0ce44163` |
| 8 | `POST /v1/auth/token` | 401 | 41 | `qa-a8e3b85f-5938-431b-b257-3a8f961ea702` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-f28011ed-ead0-4de4-9d98-cc36067d01df` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-5da44831-8eb4-45d3-90a3-4d66f9d924a5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c4cd3332-1945-45ae-b100-82a0a2617f0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4cd3332-1945-45ae-b100-82a0a2617f0a
Content-Type: application/json

--- request body ---
{"handle":"qa-92b3d1950f13","displayName":"QA 92b3d1950f13","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4cd3332-1945-45ae-b100-82a0a2617f0a
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
Location: /v1/accounts/qa-92b3d1950f13
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f7f9d378-b3ed-4462-acc6-ee8581e0549c","handle":"qa-92b3d1950f13","displayName":"QA 92b3d1950f13","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.247069281Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7e2cc3e6-ec6c-47b9-b975-22376d82689f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e2cc3e6-ec6c-47b9-b975-22376d82689f
Content-Type: application/json

--- request body ---
{"handle":"qa-bec68835a578","displayName":"QA bec68835a578","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e2cc3e6-ec6c-47b9-b975-22376d82689f
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
Location: /v1/accounts/qa-bec68835a578
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ab79b218-fd28-4ac5-a793-966f48ce30c4","handle":"qa-bec68835a578","displayName":"QA bec68835a578","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.300280968Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-09a4f89a-d5f1-4635-807e-17f4cbaa783c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09a4f89a-d5f1-4635-807e-17f4cbaa783c
Content-Type: application/json

--- request body ---
{"handle":"qa-92b3d1950f13","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-09a4f89a-d5f1-4635-807e-17f4cbaa783c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f7f9d378-b3ed-4462-acc6-ee8581e0549c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cea8df3b-16c7-449b-97ac-9f93838fafac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cea8df3b-16c7-449b-97ac-9f93838fafac
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bec68835a578","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-cea8df3b-16c7-449b-97ac-9f93838fafac
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
Location: /v1/conversations/cnv_85c6cf6c-dd42-4cb7-a0d2-bcb15084fd11
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_85c6cf6c-dd42-4cb7-a0d2-bcb15084fd11","subject":"Error contract","status":"open","region":"eu","participants":["qa-92b3d1950f13","qa-bec68835a578"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:46.387412082Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-441f65d4-05b6-49c0-83c8-fc7a1923c4c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-441f65d4-05b6-49c0-83c8-fc7a1923c4c4
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-441f65d4-05b6-49c0-83c8-fc7a1923c4c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-441f65d4-05b6-49c0-83c8-fc7a1923c4c4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f4712eaa-7a6c-4d0f-b4ca-84b1c3fef615

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4712eaa-7a6c-4d0f-b4ca-84b1c3fef615
Content-Type: application/json

--- request body ---
{"handle":"qa-bec68835a578","password":"****"}

--- response: 200 in 38 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4712eaa-7a6c-4d0f-b4ca-84b1c3fef615
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ab79b218-fd28-4ac5-a793-966f48ce30c4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1d668792-b7cc-48d8-bfda-de2e0ce44163

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d668792-b7cc-48d8-bfda-de2e0ce44163
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1d668792-b7cc-48d8-bfda-de2e0ce44163
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
correlation: qa-a8e3b85f-5938-431b-b257-3a8f961ea702

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8e3b85f-5938-431b-b257-3a8f961ea702
Content-Type: application/json

--- request body ---
{"handle":"qa-bec68835a578","password":"****"}

--- response: 401 in 41 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8e3b85f-5938-431b-b257-3a8f961ea702
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a8e3b85f-5938-431b-b257-3a8f961ea702"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f28011ed-ead0-4de4-9d98-cc36067d01df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f28011ed-ead0-4de4-9d98-cc36067d01df
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f28011ed-ead0-4de4-9d98-cc36067d01df
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
correlation: qa-5da44831-8eb4-45d3-90a3-4d66f9d924a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5da44831-8eb4-45d3-90a3-4d66f9d924a5
Content-Type: application/json

--- request body ---
{"handle":"qa-92b3d1950f13","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5da44831-8eb4-45d3-90a3-4d66f9d924a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5da44831-8eb4-45d3-90a3-4d66f9d924a5"}
```
