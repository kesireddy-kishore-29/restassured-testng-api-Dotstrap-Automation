# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-73ffc4bc-a8cb-4435-81b7-db8d8be45166` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-ec7bc8dc-4d11-4449-8239-0018fb8c52af` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-1efcd7c1-9aaf-4f12-9bab-dcd71f893d59` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-5e016aa0-bc3f-46f9-808e-8d86fd10fb83` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 18 | `qa-6c254e31-e7c2-48f9-88c4-b1cb4ad15aa8` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-9cc3768b-5857-4c46-b26c-5271c231208b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-fad48f98-21d9-4d22-9f95-085ba378e84a` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-ea285895-4d35-429e-ae19-3deeaf60e03e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 51 | `qa-87164309-9466-4351-950c-599eb952446f` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-22b91a52-2fc5-4076-be49-9daff01c4c6f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-73ffc4bc-a8cb-4435-81b7-db8d8be45166

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73ffc4bc-a8cb-4435-81b7-db8d8be45166
Content-Type: application/json

--- request body ---
{"handle":"qa-33c8462da263","displayName":"QA 33c8462da263","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-73ffc4bc-a8cb-4435-81b7-db8d8be45166
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 7
Location: /v1/accounts/qa-33c8462da263
X-Served-Region: eu
Content-Length: 181

{"id":"acc_19918c88-3951-400c-92a5-e6a20839cd4d","handle":"qa-33c8462da263","displayName":"QA 33c8462da263","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.097253496Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ec7bc8dc-4d11-4449-8239-0018fb8c52af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec7bc8dc-4d11-4449-8239-0018fb8c52af
Content-Type: application/json

--- request body ---
{"handle":"qa-c61ddfba66cb","displayName":"QA c61ddfba66cb","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec7bc8dc-4d11-4449-8239-0018fb8c52af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 7
Location: /v1/accounts/qa-c61ddfba66cb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0a60ab8c-14f7-48c5-9c90-c78cb02dadcc","handle":"qa-c61ddfba66cb","displayName":"QA c61ddfba66cb","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.165545005Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1efcd7c1-9aaf-4f12-9bab-dcd71f893d59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1efcd7c1-9aaf-4f12-9bab-dcd71f893d59
Content-Type: application/json

--- request body ---
{"handle":"qa-33c8462da263","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-1efcd7c1-9aaf-4f12-9bab-dcd71f893d59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_19918c88-3951-400c-92a5-e6a20839cd4d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5e016aa0-bc3f-46f9-808e-8d86fd10fb83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e016aa0-bc3f-46f9-808e-8d86fd10fb83
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c61ddfba66cb","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e016aa0-bc3f-46f9-808e-8d86fd10fb83
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
Location: /v1/conversations/cnv_9b4d61d5-f64a-4b00-af70-66db19424d85
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9b4d61d5-f64a-4b00-af70-66db19424d85","subject":"Error contract","status":"open","region":"eu","participants":["qa-33c8462da263","qa-c61ddfba66cb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.259908405Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_9b4d61d5-f64a-4b00-af70-66db19424d85/messages
correlation: qa-6c254e31-e7c2-48f9-88c4-b1cb4ad15aa8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 2f99a65a-4a59-4bd7-841c-410234a893dd
X-Correlation-Id: qa-6c254e31-e7c2-48f9-88c4-b1cb4ad15aa8
Content-Type: application/json

--- response: 503 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c254e31-e7c2-48f9-88c4-b1cb4ad15aa8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_9b4d61d5-f64a-4b00-af70-66db19424d85/messages","correlationId":"qa-6c254e31-e7c2-48f9-88c4-b1cb4ad15aa8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9cc3768b-5857-4c46-b26c-5271c231208b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cc3768b-5857-4c46-b26c-5271c231208b
Content-Type: application/json

--- request body ---
{"handle":"qa-c61ddfba66cb","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cc3768b-5857-4c46-b26c-5271c231208b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0a60ab8c-14f7-48c5-9c90-c78cb02dadcc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fad48f98-21d9-4d22-9f95-085ba378e84a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fad48f98-21d9-4d22-9f95-085ba378e84a
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fad48f98-21d9-4d22-9f95-085ba378e84a
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
correlation: qa-ea285895-4d35-429e-ae19-3deeaf60e03e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea285895-4d35-429e-ae19-3deeaf60e03e
Content-Type: application/json

--- request body ---
{"handle":"qa-c61ddfba66cb","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea285895-4d35-429e-ae19-3deeaf60e03e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ea285895-4d35-429e-ae19-3deeaf60e03e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-87164309-9466-4351-950c-599eb952446f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87164309-9466-4351-950c-599eb952446f
Content-Type: application/json

--- response: 204 in 51 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-87164309-9466-4351-950c-599eb952446f
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
correlation: qa-22b91a52-2fc5-4076-be49-9daff01c4c6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22b91a52-2fc5-4076-be49-9daff01c4c6f
Content-Type: application/json

--- request body ---
{"handle":"qa-33c8462da263","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22b91a52-2fc5-4076-be49-9daff01c4c6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22b91a52-2fc5-4076-be49-9daff01c4c6f"}
```
