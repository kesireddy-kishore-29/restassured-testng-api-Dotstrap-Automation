# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 372 | `qa-349604fd-7556-462c-9549-7971771ceb75` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-a2fc256d-3379-4243-aa2c-a63f5ccc06b0` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-f0d28cd5-7f66-4add-af4c-4aa502d534cf` |
| 4 | `POST /v1/conversations` | 201 | 90 | `qa-3e45cda4-0074-4113-bb9f-60e5f00e96d0` |
| 5 | `POST /v1/auth/token` | 200 | 37 | `qa-0efed5f9-39fd-4bd5-a4b8-d60dacdc9faa` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 18 | `qa-7dfc2ef0-b913-416a-bec7-06f4a66f8929` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 58 | `qa-4d0ff6d3-4221-4306-aece-d9a8c72c57bb` |
| 8 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-42d2447e-a70f-4c8e-b09a-1775becf3d6e` |
| 9 | `POST /v1/auth/token` | 401 | 22 | `qa-a3fea19a-8eb7-4d46-86c3-131bfd47f81e` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-ce881010-5a63-43e6-9137-2b5c00fc7a7e` |
| 11 | `POST /v1/auth/token` | 401 | 11 | `qa-0412e608-e06a-41a9-98cc-a0bca45460ce` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-349604fd-7556-462c-9549-7971771ceb75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-349604fd-7556-462c-9549-7971771ceb75
Content-Type: application/json

--- request body ---
{"handle":"qa-15ed49800e44","displayName":"QA 15ed49800e44","password":"****","region":"eu"}

--- response: 201 in 372 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-349604fd-7556-462c-9549-7971771ceb75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-15ed49800e44
X-Served-Region: eu
Content-Length: 181

{"id":"acc_63045611-5e9b-483f-940d-3a263e983295","handle":"qa-15ed49800e44","displayName":"QA 15ed49800e44","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.058682896Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a2fc256d-3379-4243-aa2c-a63f5ccc06b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2fc256d-3379-4243-aa2c-a63f5ccc06b0
Content-Type: application/json

--- request body ---
{"handle":"qa-c3474bae1b7c","displayName":"QA c3474bae1b7c","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2fc256d-3379-4243-aa2c-a63f5ccc06b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-c3474bae1b7c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8f5ab2db-adc2-48c1-af58-96893d4ec53d","handle":"qa-c3474bae1b7c","displayName":"QA c3474bae1b7c","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.431811854Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f0d28cd5-7f66-4add-af4c-4aa502d534cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0d28cd5-7f66-4add-af4c-4aa502d534cf
Content-Type: application/json

--- request body ---
{"handle":"qa-15ed49800e44","password":"****"}

--- response: 200 in 43 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0d28cd5-7f66-4add-af4c-4aa502d534cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_63045611-5e9b-483f-940d-3a263e983295"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3e45cda4-0074-4113-bb9f-60e5f00e96d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e45cda4-0074-4113-bb9f-60e5f00e96d0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c3474bae1b7c","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 90 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e45cda4-0074-4113-bb9f-60e5f00e96d0
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
Location: /v1/conversations/cnv_766adfd0-95e3-4864-bbb2-ce5bea37922d
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_766adfd0-95e3-4864-bbb2-ce5bea37922d","subject":"Lunch?","status":"open","region":"eu","participants":["qa-15ed49800e44","qa-c3474bae1b7c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:24.586100406Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-0efed5f9-39fd-4bd5-a4b8-d60dacdc9faa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0efed5f9-39fd-4bd5-a4b8-d60dacdc9faa
Content-Type: application/json

--- request body ---
{"handle":"qa-c3474bae1b7c","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-0efed5f9-39fd-4bd5-a4b8-d60dacdc9faa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8f5ab2db-adc2-48c1-af58-96893d4ec53d"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_766adfd0-95e3-4864-bbb2-ce5bea37922d/messages
correlation: qa-7dfc2ef0-b913-416a-bec7-06f4a66f8929

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dfc2ef0-b913-416a-bec7-06f4a66f8929
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-7dfc2ef0-b913-416a-bec7-06f4a66f8929
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
Content-Length: 203

{"id":"msg_a6576d44-e321-48fe-8d8f-5512c35a8783","conversationId":"cnv_766adfd0-95e3-4864-bbb2-ce5bea37922d","sender":"qa-c3474bae1b7c","body":"Friday works","createdAt":"2026-10-25T07:40:24.784151535Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_766adfd0-95e3-4864-bbb2-ce5bea37922d/messages
correlation: qa-4d0ff6d3-4221-4306-aece-d9a8c72c57bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d0ff6d3-4221-4306-aece-d9a8c72c57bb
Content-Type: application/json

--- response: 200 in 58 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d0ff6d3-4221-4306-aece-d9a8c72c57bb
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
Content-Length: 432

{"items":[{"id":"msg_100d4409-87b2-4b55-aa12-78a9285871c3","conversationId":"cnv_766adfd0-95e3-4864-bbb2-ce5bea37922d","sender":"qa-15ed49800e44","body":"Free on Friday?","createdAt":"2026-10-25T07:40:24.586364378Z"},{"id":"msg_a6576d44-e321-48fe-8d8f-5512c35a8783","conversationId":"cnv_766adfd0-95e3-4864-bbb2-ce5bea37922d","sender":"qa-c3474bae1b7c","body":"Friday works","createdAt":"2026-10-25T07:40:24.784151535Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-42d2447e-a70f-4c8e-b09a-1775becf3d6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42d2447e-a70f-4c8e-b09a-1775becf3d6e
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-42d2447e-a70f-4c8e-b09a-1775becf3d6e
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-a3fea19a-8eb7-4d46-86c3-131bfd47f81e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3fea19a-8eb7-4d46-86c3-131bfd47f81e
Content-Type: application/json

--- request body ---
{"handle":"qa-c3474bae1b7c","password":"****"}

--- response: 401 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a3fea19a-8eb7-4d46-86c3-131bfd47f81e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a3fea19a-8eb7-4d46-86c3-131bfd47f81e"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce881010-5a63-43e6-9137-2b5c00fc7a7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce881010-5a63-43e6-9137-2b5c00fc7a7e
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce881010-5a63-43e6-9137-2b5c00fc7a7e
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-0412e608-e06a-41a9-98cc-a0bca45460ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0412e608-e06a-41a9-98cc-a0bca45460ce
Content-Type: application/json

--- request body ---
{"handle":"qa-15ed49800e44","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0412e608-e06a-41a9-98cc-a0bca45460ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0412e608-e06a-41a9-98cc-a0bca45460ce"}
```
