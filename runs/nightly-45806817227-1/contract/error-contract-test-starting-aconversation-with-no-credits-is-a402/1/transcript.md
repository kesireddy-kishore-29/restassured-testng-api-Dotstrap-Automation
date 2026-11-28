# Transcript: With no credits left, starting a conversation is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#startingAConversationWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-9de3b041-bc29-4df6-865e-ac7a68df66ac` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-0627251e-86ba-4874-8a39-cd7a5ac865a5` |
| 3 | `POST /v1/auth/token` | 200 | 58 | `qa-c58a41d9-19c1-476e-84d0-4e488ade7ed2` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-ee6e3fce-7c6b-4d26-abb9-59842b68dfd8` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 18 | `qa-ab1bb8a7-d2fe-45be-a23f-477a6ce75c8b` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-884a1c96-274e-4aa1-acd5-acd45a7931cc` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-680daab0-9398-4ad2-8fcc-e92f14566d0e` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-0e33c7f4-e8a0-4736-9601-98e7f7122930` |
| 9 | `GET /v1/credits/balance` | 200 | 16 | `qa-73c197a3-1aa0-496a-9295-af9896c3e223` |
| 10 | `POST /v1/conversations` | 402 | 18 | `qa-28addb1e-dc04-4dd0-9b1d-f94c23c7ed59` |
| 11 | `GET /v1/credits/ledger` | 200 | 10 | `qa-5c67b57c-b27e-4235-8d65-cdae4bbbd1a5` |
| 12 | `POST /v1/auth/token` | 200 | 14 | `qa-95d3ddc9-76ea-442b-900f-cb14b9cd31d1` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-17ac9288-f652-49d9-8860-9e22f5e04051` |
| 14 | `POST /v1/auth/token` | 401 | 9 | `qa-1d332dc8-3e3d-4ac6-8a0d-27555f7941f3` |
| 15 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-0c5e518c-e965-4d40-a073-c6ba94fe826d` |
| 16 | `POST /v1/auth/token` | 401 | 8 | `qa-d818a498-4312-4dd3-a608-2186c4f5e127` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9de3b041-bc29-4df6-865e-ac7a68df66ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9de3b041-bc29-4df6-865e-ac7a68df66ac
Content-Type: application/json

--- request body ---
{"handle":"qa-abca038dd0cc","displayName":"QA abca038dd0cc","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-9de3b041-bc29-4df6-865e-ac7a68df66ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 7
Location: /v1/accounts/qa-abca038dd0cc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea9de651-b720-432a-ab47-3cfbc4816696","handle":"qa-abca038dd0cc","displayName":"QA abca038dd0cc","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.113226663Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0627251e-86ba-4874-8a39-cd7a5ac865a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0627251e-86ba-4874-8a39-cd7a5ac865a5
Content-Type: application/json

--- request body ---
{"handle":"qa-a0f55c2d0dbe","displayName":"QA a0f55c2d0dbe","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-0627251e-86ba-4874-8a39-cd7a5ac865a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Location: /v1/accounts/qa-a0f55c2d0dbe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2fcb1396-6bf3-48be-88f3-4bba7d64246c","handle":"qa-a0f55c2d0dbe","displayName":"QA a0f55c2d0dbe","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.170283674Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c58a41d9-19c1-476e-84d0-4e488ade7ed2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c58a41d9-19c1-476e-84d0-4e488ade7ed2
Content-Type: application/json

--- request body ---
{"handle":"qa-abca038dd0cc","password":"****"}

--- response: 200 in 58 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c58a41d9-19c1-476e-84d0-4e488ade7ed2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea9de651-b720-432a-ab47-3cfbc4816696"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ee6e3fce-7c6b-4d26-abb9-59842b68dfd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee6e3fce-7c6b-4d26-abb9-59842b68dfd8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a0f55c2d0dbe","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee6e3fce-7c6b-4d26-abb9-59842b68dfd8
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
Location: /v1/conversations/cnv_d65b067d-7ecf-45b7-b0d4-9eb2239e2bb1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d65b067d-7ecf-45b7-b0d4-9eb2239e2bb1","subject":"Error contract","status":"open","region":"eu","participants":["qa-abca038dd0cc","qa-a0f55c2d0dbe"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:46.293731723Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_d65b067d-7ecf-45b7-b0d4-9eb2239e2bb1/messages
correlation: qa-ab1bb8a7-d2fe-45be-a23f-477a6ce75c8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab1bb8a7-d2fe-45be-a23f-477a6ce75c8b
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab1bb8a7-d2fe-45be-a23f-477a6ce75c8b
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
Content-Length: 192

{"id":"msg_d9776f90-c0ef-466b-908b-a4befab3f665","conversationId":"cnv_d65b067d-7ecf-45b7-b0d4-9eb2239e2bb1","sender":"qa-abca038dd0cc","body":"2","createdAt":"2026-11-26T11:02:46.340131888Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_d65b067d-7ecf-45b7-b0d4-9eb2239e2bb1/messages
correlation: qa-884a1c96-274e-4aa1-acd5-acd45a7931cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-884a1c96-274e-4aa1-acd5-acd45a7931cc
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-884a1c96-274e-4aa1-acd5-acd45a7931cc
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
Content-Length: 192

{"id":"msg_261a0b1a-415d-4e5d-8c20-5bda8bf184bb","conversationId":"cnv_d65b067d-7ecf-45b7-b0d4-9eb2239e2bb1","sender":"qa-abca038dd0cc","body":"3","createdAt":"2026-11-26T11:02:46.364235598Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_d65b067d-7ecf-45b7-b0d4-9eb2239e2bb1/messages
correlation: qa-680daab0-9398-4ad2-8fcc-e92f14566d0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-680daab0-9398-4ad2-8fcc-e92f14566d0e
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-680daab0-9398-4ad2-8fcc-e92f14566d0e
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
Content-Length: 192

{"id":"msg_e6ec9f19-cb30-4499-af77-a73d0784dd79","conversationId":"cnv_d65b067d-7ecf-45b7-b0d4-9eb2239e2bb1","sender":"qa-abca038dd0cc","body":"4","createdAt":"2026-11-26T11:02:46.404519039Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_d65b067d-7ecf-45b7-b0d4-9eb2239e2bb1/messages
correlation: qa-0e33c7f4-e8a0-4736-9601-98e7f7122930

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e33c7f4-e8a0-4736-9601-98e7f7122930
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e33c7f4-e8a0-4736-9601-98e7f7122930
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
Content-Length: 192

{"id":"msg_6c2f8b05-a2f6-48f3-93c6-45e8ce708a42","conversationId":"cnv_d65b067d-7ecf-45b7-b0d4-9eb2239e2bb1","sender":"qa-abca038dd0cc","body":"5","createdAt":"2026-11-26T11:02:46.439218832Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-73c197a3-1aa0-496a-9295-af9896c3e223

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73c197a3-1aa0-496a-9295-af9896c3e223
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-73c197a3-1aa0-496a-9295-af9896c3e223
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
Content-Length: 89

{"balance":0,"currency":"credits","accountId":"acc_ea9de651-b720-432a-ab47-3cfbc4816696"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-28addb1e-dc04-4dd0-9b1d-f94c23c7ed59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28addb1e-dc04-4dd0-9b1d-f94c23c7ed59
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a0f55c2d0dbe","subject":"One more","message":"Hi"}

--- response: 402 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-28addb1e-dc04-4dd0-9b1d-f94c23c7ed59
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
Content-Length: 270

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-28addb1e-dc04-4dd0-9b1d-f94c23c7ed59"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-5c67b57c-b27e-4235-8d65-cdae4bbbd1a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c67b57c-b27e-4235-8d65-cdae4bbbd1a5
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c67b57c-b27e-4235-8d65-cdae4bbbd1a5
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
Content-Length: 1169

{"items":[{"id":"led_97064356-5d58-4f89-887b-abff9eed1a3c","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-26T11:02:46.113236952Z"},{"id":"led_50451169-c8d4-42a4-a8b4-e2c490c383a1","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_d65b067d-7ecf-45b7-b0d4-9eb2239e2bb1","createdAt":"2026-11-26T11:02:46.293719641Z"},{"id":"led_13465be4-0b1c-4b0b-a0a6-7ff0a5050fc5","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_d9776f90-c0ef-466b-908b-a4befab3f665","createdAt":"2026-11-26T11:02:46.340126108Z"},{"id":"led_5dd3fcd9-d0d3-4adc-bb0a-dc0a07a720da","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_261a0b1a-415d-4e5d-8c20-5bda8bf184bb","createdAt":"2026-11-26T11:02:46.364218836Z"},{"id":"led_7519def1-6744-47ad-91aa-9a04c93e9fed","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_e6ec9f19-cb30-4499-af77-a73d0784dd79","createdAt":"2026-11-26T11:02:46.404512096Z"},{"id":"led_e4943b07-b6f0-4cdc-8ad9-6b823acb58d7","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_6c2f8b05-a2f6-48f3-93c6-45e8ce708a42","createdAt":"2026-11-26T11:02:46.439207902Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-95d3ddc9-76ea-442b-900f-cb14b9cd31d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95d3ddc9-76ea-442b-900f-cb14b9cd31d1
Content-Type: application/json

--- request body ---
{"handle":"qa-a0f55c2d0dbe","password":"****"}

--- response: 200 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-95d3ddc9-76ea-442b-900f-cb14b9cd31d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fcb1396-6bf3-48be-88f3-4bba7d64246c"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-17ac9288-f652-49d9-8860-9e22f5e04051

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17ac9288-f652-49d9-8860-9e22f5e04051
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-17ac9288-f652-49d9-8860-9e22f5e04051
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-1d332dc8-3e3d-4ac6-8a0d-27555f7941f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d332dc8-3e3d-4ac6-8a0d-27555f7941f3
Content-Type: application/json

--- request body ---
{"handle":"qa-a0f55c2d0dbe","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d332dc8-3e3d-4ac6-8a0d-27555f7941f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1d332dc8-3e3d-4ac6-8a0d-27555f7941f3"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c5e518c-e965-4d40-a073-c6ba94fe826d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c5e518c-e965-4d40-a073-c6ba94fe826d
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c5e518c-e965-4d40-a073-c6ba94fe826d
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
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-d818a498-4312-4dd3-a608-2186c4f5e127

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d818a498-4312-4dd3-a608-2186c4f5e127
Content-Type: application/json

--- request body ---
{"handle":"qa-abca038dd0cc","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d818a498-4312-4dd3-a608-2186c4f5e127
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d818a498-4312-4dd3-a608-2186c4f5e127"}
```
