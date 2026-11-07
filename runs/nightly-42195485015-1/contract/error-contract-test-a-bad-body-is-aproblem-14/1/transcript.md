# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-49884d04-f897-4c19-9368-8e404a723523` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-6e9ad03e-ad15-446b-ade4-64074b875fe5` |
| 3 | `POST /v1/auth/token` | 200 | 57 | `qa-46a75a96-daad-41df-acf1-c766d14928c6` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-8ed12870-e447-49f8-ada1-ccb4c9e5fdee` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 20 | `qa-f1dfa784-4275-4282-816a-d1edcc33378e` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-fee89168-b2d6-4e09-ae62-1c03910a665e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-7f02d783-82b9-48c2-90f4-d36f5f9c7e3c` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-fc348e43-6df5-4cfe-8577-2eaebe13c3c8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-2eec6c47-c63f-4809-91a9-7c0a24762840` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-8362f9c3-2d3c-4460-8ff7-f98984d6eb34` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-49884d04-f897-4c19-9368-8e404a723523

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49884d04-f897-4c19-9368-8e404a723523
Content-Type: application/json

--- request body ---
{"handle":"qa-3a0a44a86c53","displayName":"QA 3a0a44a86c53","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-49884d04-f897-4c19-9368-8e404a723523
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 6
Location: /v1/accounts/qa-3a0a44a86c53
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f28915e5-654c-412d-b090-a29042d04c81","handle":"qa-3a0a44a86c53","displayName":"QA 3a0a44a86c53","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.350788523Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6e9ad03e-ad15-446b-ade4-64074b875fe5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e9ad03e-ad15-446b-ade4-64074b875fe5
Content-Type: application/json

--- request body ---
{"handle":"qa-c60332560310","displayName":"QA c60332560310","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e9ad03e-ad15-446b-ade4-64074b875fe5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 6
Location: /v1/accounts/qa-c60332560310
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8a0e5ff5-274a-4b99-81bb-aada5e12ca19","handle":"qa-c60332560310","displayName":"QA c60332560310","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.410534362Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-46a75a96-daad-41df-acf1-c766d14928c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46a75a96-daad-41df-acf1-c766d14928c6
Content-Type: application/json

--- request body ---
{"handle":"qa-3a0a44a86c53","password":"****"}

--- response: 200 in 57 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-46a75a96-daad-41df-acf1-c766d14928c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f28915e5-654c-412d-b090-a29042d04c81"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8ed12870-e447-49f8-ada1-ccb4c9e5fdee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ed12870-e447-49f8-ada1-ccb4c9e5fdee
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c60332560310","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ed12870-e447-49f8-ada1-ccb4c9e5fdee
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
Location: /v1/conversations/cnv_76f6ed1b-f685-4f7c-acbc-06178fd1ae62
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_76f6ed1b-f685-4f7c-acbc-06178fd1ae62","subject":"Error contract","status":"open","region":"eu","participants":["qa-3a0a44a86c53","qa-c60332560310"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:34.534300546Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_76f6ed1b-f685-4f7c-acbc-06178fd1ae62/messages
correlation: qa-f1dfa784-4275-4282-816a-d1edcc33378e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1dfa784-4275-4282-816a-d1edcc33378e
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1dfa784-4275-4282-816a-d1edcc33378e
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_76f6ed1b-f685-4f7c-acbc-06178fd1ae62/messages","correlationId":"qa-f1dfa784-4275-4282-816a-d1edcc33378e","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fee89168-b2d6-4e09-ae62-1c03910a665e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fee89168-b2d6-4e09-ae62-1c03910a665e
Content-Type: application/json

--- request body ---
{"handle":"qa-c60332560310","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-fee89168-b2d6-4e09-ae62-1c03910a665e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8a0e5ff5-274a-4b99-81bb-aada5e12ca19"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7f02d783-82b9-48c2-90f4-d36f5f9c7e3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f02d783-82b9-48c2-90f4-d36f5f9c7e3c
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7f02d783-82b9-48c2-90f4-d36f5f9c7e3c
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
correlation: qa-fc348e43-6df5-4cfe-8577-2eaebe13c3c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc348e43-6df5-4cfe-8577-2eaebe13c3c8
Content-Type: application/json

--- request body ---
{"handle":"qa-c60332560310","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc348e43-6df5-4cfe-8577-2eaebe13c3c8
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fc348e43-6df5-4cfe-8577-2eaebe13c3c8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2eec6c47-c63f-4809-91a9-7c0a24762840

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2eec6c47-c63f-4809-91a9-7c0a24762840
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2eec6c47-c63f-4809-91a9-7c0a24762840
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
correlation: qa-8362f9c3-2d3c-4460-8ff7-f98984d6eb34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8362f9c3-2d3c-4460-8ff7-f98984d6eb34
Content-Type: application/json

--- request body ---
{"handle":"qa-3a0a44a86c53","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8362f9c3-2d3c-4460-8ff7-f98984d6eb34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8362f9c3-2d3c-4460-8ff7-f98984d6eb34"}
```
