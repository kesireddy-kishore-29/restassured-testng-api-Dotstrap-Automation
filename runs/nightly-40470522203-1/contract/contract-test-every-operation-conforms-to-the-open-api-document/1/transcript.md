# Transcript: Every operation in the OpenAPI document answers as documented (checked per response)

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#everyOperationConformsToTheOpenApiDocument` |
| Features | FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 23 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 438 | `qa-2363268d-0598-4d3b-9961-fd3549f1e18e` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-5828d069-230d-4686-80ea-4574cfc22ecf` |
| 3 | `GET /health` | 200 | 43 | `qa-f72a7ac3-bbe9-4f06-a69b-fe43f31b485a` |
| 4 | `POST /v1/auth/token` | 200 | 25 | `qa-0ebfc469-084f-4c0e-b85d-41ab57356c88` |
| 5 | `GET /v1/accounts/me` | 200 | 30 | `qa-efeb2b8a-b641-4f66-ba74-9e41482bcf46` |
| 6 | `PATCH /v1/accounts/me` | 200 | 46 | `qa-595a76f7-edf4-4283-8b0c-3605193b5646` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 25 | `qa-aa882396-750f-461f-9dd4-87e8ccc312c1` |
| 8 | `POST /v1/conversations` | 201 | 18 | `qa-93716eff-dfac-413b-a0b9-dcb3b6cee405` |
| 9 | `GET /v1/conversations` | 200 | 15 | `qa-b07c88d5-d17a-4e1e-b2e4-77224c5bf1a0` |
| 10 | `POST /v1/auth/token` | 200 | 14 | `qa-9f4b35b4-5a1d-402a-a2c7-cd9a649035ca` |
| 11 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-b0e98fd7-88d5-4271-b615-f6e2963e1c80` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 17 | `qa-bcd895e8-51c2-420f-9c61-ec813f7384b9` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 22 | `qa-ea868d85-dae7-42b9-99a4-85940b3de8b9` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 15 | `qa-8fa1f0cc-8dfa-40c3-9957-c6328befa562` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 12 | `qa-e6eab6c5-a93d-4fce-880f-9ca0472f31a8` |
| 16 | `GET /v1/credits/balance` | 200 | 20 | `qa-f35a4690-b055-44a2-b7e1-80ae0f7bd927` |
| 17 | `GET /v1/credits/ledger` | 200 | 9 | `qa-7b7f935c-b408-4392-a93b-1d383457b858` |
| 18 | `POST /v1/credits/purchases` | 201 | 13 | `qa-1d574c25-ec67-452c-81e6-385e10b61d98` |
| 19 | `GET /v1/admin/stats` | 403 | 10 | `qa-385c749f-2dc3-4190-b418-4bc41fb4e611` |
| 20 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-e177da10-e554-4f97-8b2c-a668c7bea733` |
| 21 | `POST /v1/auth/token` | 401 | 18 | `qa-2e7ca7da-7dc1-4cd3-bb54-55924cb2e76c` |
| 22 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-41ee8fa5-4e85-40c6-9959-66d4821a6f39` |
| 23 | `POST /v1/auth/token` | 401 | 29 | `qa-02615945-cd75-4082-946e-07b9973cc0d0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2363268d-0598-4d3b-9961-fd3549f1e18e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2363268d-0598-4d3b-9961-fd3549f1e18e
Content-Type: application/json

--- request body ---
{"handle":"qa-637573ecb81c","displayName":"QA 637573ecb81c","password":"****","region":"eu"}

--- response: 201 in 438 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2363268d-0598-4d3b-9961-fd3549f1e18e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-637573ecb81c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c646871a-3887-48fc-9d9c-0af3f912379f","handle":"qa-637573ecb81c","displayName":"QA 637573ecb81c","region":"eu","role":"user","createdAt":"2026-10-27T08:00:31.273228355Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5828d069-230d-4686-80ea-4574cfc22ecf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5828d069-230d-4686-80ea-4574cfc22ecf
Content-Type: application/json

--- request body ---
{"handle":"qa-e8131c6c42d4","displayName":"QA e8131c6c42d4","password":"****","region":"us"}

--- response: 201 in 45 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-5828d069-230d-4686-80ea-4574cfc22ecf
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
Location: /v1/accounts/qa-e8131c6c42d4
X-Served-Region: us
Content-Length: 181

{"id":"acc_a3ac3995-8edb-401e-8010-9c13b1a2a3bc","handle":"qa-e8131c6c42d4","displayName":"QA e8131c6c42d4","region":"us","role":"user","createdAt":"2026-10-27T08:00:31.700843102Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-f72a7ac3-bbe9-4f06-a69b-fe43f31b485a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f72a7ac3-bbe9-4f06-a69b-fe43f31b485a
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f72a7ac3-bbe9-4f06-a69b-fe43f31b485a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 95

{"status":"UP","version":"1.0.0","region":"eu","regions":["in","eu","us"],"faultsEnabled":true}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0ebfc469-084f-4c0e-b85d-41ab57356c88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ebfc469-084f-4c0e-b85d-41ab57356c88
Content-Type: application/json

--- request body ---
{"handle":"qa-637573ecb81c","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ebfc469-084f-4c0e-b85d-41ab57356c88
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c646871a-3887-48fc-9d9c-0af3f912379f"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-efeb2b8a-b641-4f66-ba74-9e41482bcf46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efeb2b8a-b641-4f66-ba74-9e41482bcf46
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-efeb2b8a-b641-4f66-ba74-9e41482bcf46
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
Content-Length: 181

{"id":"acc_c646871a-3887-48fc-9d9c-0af3f912379f","handle":"qa-637573ecb81c","displayName":"QA 637573ecb81c","region":"eu","role":"user","createdAt":"2026-10-27T08:00:31.273228355Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-595a76f7-edf4-4283-8b0c-3605193b5646

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-595a76f7-edf4-4283-8b0c-3605193b5646
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 46 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-595a76f7-edf4-4283-8b0c-3605193b5646
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
Content-Length: 178

{"id":"acc_c646871a-3887-48fc-9d9c-0af3f912379f","handle":"qa-637573ecb81c","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-10-27T08:00:31.273228355Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-e8131c6c42d4
correlation: qa-aa882396-750f-461f-9dd4-87e8ccc312c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa882396-750f-461f-9dd4-87e8ccc312c1
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa882396-750f-461f-9dd4-87e8ccc312c1
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
Content-Length: 74

{"handle":"qa-e8131c6c42d4","displayName":"QA e8131c6c42d4","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-93716eff-dfac-413b-a0b9-dcb3b6cee405

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93716eff-dfac-413b-a0b9-dcb3b6cee405
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e8131c6c42d4","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-93716eff-dfac-413b-a0b9-dcb3b6cee405
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_ef86b80e-2684-4a5f-b3f7-c6573fecc2c3
X-Data-Region: us
Content-Length: 238

{"id":"cnv_ef86b80e-2684-4a5f-b3f7-c6573fecc2c3","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-637573ecb81c","qa-e8131c6c42d4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:32.033208760Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-b07c88d5-d17a-4e1e-b2e4-77224c5bf1a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b07c88d5-d17a-4e1e-b2e4-77224c5bf1a0
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b07c88d5-d17a-4e1e-b2e4-77224c5bf1a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 260

{"items":[{"id":"cnv_ef86b80e-2684-4a5f-b3f7-c6573fecc2c3","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-637573ecb81c","qa-e8131c6c42d4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:32.033208760Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9f4b35b4-5a1d-402a-a2c7-cd9a649035ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f4b35b4-5a1d-402a-a2c7-cd9a649035ca
Content-Type: application/json

--- request body ---
{"handle":"qa-e8131c6c42d4","password":"****"}

--- response: 200 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f4b35b4-5a1d-402a-a2c7-cd9a649035ca
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3ac3995-8edb-401e-8010-9c13b1a2a3bc"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_ef86b80e-2684-4a5f-b3f7-c6573fecc2c3
correlation: qa-b0e98fd7-88d5-4271-b615-f6e2963e1c80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0e98fd7-88d5-4271-b615-f6e2963e1c80
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0e98fd7-88d5-4271-b615-f6e2963e1c80
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
X-Served-Region: us
X-Data-Region: us
Content-Length: 238

{"id":"cnv_ef86b80e-2684-4a5f-b3f7-c6573fecc2c3","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-637573ecb81c","qa-e8131c6c42d4"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-27T08:00:32.033208760Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_ef86b80e-2684-4a5f-b3f7-c6573fecc2c3/messages
correlation: qa-bcd895e8-51c2-420f-9c61-ec813f7384b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcd895e8-51c2-420f-9c61-ec813f7384b9
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcd895e8-51c2-420f-9c61-ec813f7384b9
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
X-Served-Region: us
Content-Length: 215

{"items":[{"id":"msg_7f243c44-1df8-4814-bee0-3eb771886061","conversationId":"cnv_ef86b80e-2684-4a5f-b3f7-c6573fecc2c3","sender":"qa-637573ecb81c","body":"Hi","createdAt":"2026-10-27T08:00:32.033244246Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_ef86b80e-2684-4a5f-b3f7-c6573fecc2c3/messages
correlation: qa-ea868d85-dae7-42b9-99a4-85940b3de8b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea868d85-dae7-42b9-99a4-85940b3de8b9
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 22 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea868d85-dae7-42b9-99a4-85940b3de8b9
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
X-Served-Region: us
Content-Length: 196

{"id":"msg_b9e184eb-2642-46c5-bdcd-6b4125be5b9f","conversationId":"cnv_ef86b80e-2684-4a5f-b3f7-c6573fecc2c3","sender":"qa-e8131c6c42d4","body":"Reply","createdAt":"2026-10-27T08:00:32.179086441Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_ef86b80e-2684-4a5f-b3f7-c6573fecc2c3/read
correlation: qa-8fa1f0cc-8dfa-40c3-9957-c6328befa562

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fa1f0cc-8dfa-40c3-9957-c6328befa562
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fa1f0cc-8dfa-40c3-9957-c6328befa562
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 77

{"conversationId":"cnv_ef86b80e-2684-4a5f-b3f7-c6573fecc2c3","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_ef86b80e-2684-4a5f-b3f7-c6573fecc2c3/close
correlation: qa-e6eab6c5-a93d-4fce-880f-9ca0472f31a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6eab6c5-a93d-4fce-880f-9ca0472f31a8
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6eab6c5-a93d-4fce-880f-9ca0472f31a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_ef86b80e-2684-4a5f-b3f7-c6573fecc2c3","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-637573ecb81c","qa-e8131c6c42d4"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-27T08:00:32.033208760Z","closedAt":"2026-10-27T08:00:32.235711438Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-f35a4690-b055-44a2-b7e1-80ae0f7bd927

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f35a4690-b055-44a2-b7e1-80ae0f7bd927
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f35a4690-b055-44a2-b7e1-80ae0f7bd927
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_c646871a-3887-48fc-9d9c-0af3f912379f"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-7b7f935c-b408-4392-a93b-1d383457b858

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b7f935c-b408-4392-a93b-1d383457b858
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b7f935c-b408-4392-a93b-1d383457b858
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 393

{"items":[{"id":"led_24cafe17-c851-4032-a808-6f7583cec47f","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-27T08:00:31.273237783Z"},{"id":"led_af2629a7-f288-4699-8677-3e56cb668d18","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_ef86b80e-2684-4a5f-b3f7-c6573fecc2c3","createdAt":"2026-10-27T08:00:32.033165270Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1d574c25-ec67-452c-81e6-385e10b61d98

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f7eb2e4329584f06b59c54b836790489
X-Correlation-Id: qa-1d574c25-ec67-452c-81e6-385e10b61d98
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d574c25-ec67-452c-81e6-385e10b61d98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_062d5b44-1876-4aa7-8160-f6f992cd35de
Content-Length: 144

{"id":"pur_062d5b44-1876-4aa7-8160-f6f992cd35de","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-10-27T08:00:32.322365819Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-385c749f-2dc3-4190-b418-4bc41fb4e611

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-385c749f-2dc3-4190-b418-4bc41fb4e611
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-385c749f-2dc3-4190-b418-4bc41fb4e611
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-385c749f-2dc3-4190-b418-4bc41fb4e611"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e177da10-e554-4f97-8b2c-a668c7bea733

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e177da10-e554-4f97-8b2c-a668c7bea733
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e177da10-e554-4f97-8b2c-a668c7bea733
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: us
```

## 21. POST /v1/auth/token

```text
#21 POST http://localhost:7070/v1/auth/token
correlation: qa-2e7ca7da-7dc1-4cd3-bb54-55924cb2e76c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e7ca7da-7dc1-4cd3-bb54-55924cb2e76c
Content-Type: application/json

--- request body ---
{"handle":"qa-e8131c6c42d4","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e7ca7da-7dc1-4cd3-bb54-55924cb2e76c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2e7ca7da-7dc1-4cd3-bb54-55924cb2e76c"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-41ee8fa5-4e85-40c6-9959-66d4821a6f39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41ee8fa5-4e85-40c6-9959-66d4821a6f39
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-41ee8fa5-4e85-40c6-9959-66d4821a6f39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
```

## 23. POST /v1/auth/token

```text
#23 POST http://localhost:7070/v1/auth/token
correlation: qa-02615945-cd75-4082-946e-07b9973cc0d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02615945-cd75-4082-946e-07b9973cc0d0
Content-Type: application/json

--- request body ---
{"handle":"qa-637573ecb81c","password":"****"}

--- response: 401 in 29 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02615945-cd75-4082-946e-07b9973cc0d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-02615945-cd75-4082-946e-07b9973cc0d0"}
```
