# Transcript: A closed conversation refuses new messages with 409

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#closedConversationRefusesMessages` |
| Features | FEAT-CONV-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 442 | `qa-591fc075-d3f8-447e-bf20-f539cb839e07` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-60052e9b-e0ef-49d4-aaac-b0e33d01676f` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-cbf3f0be-a21c-4782-a241-c3239259e75f` |
| 4 | `POST /v1/conversations` | 201 | 77 | `qa-7cea66c2-de97-4437-a048-70a78794e068` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 17 | `qa-2cc7bab9-1dac-4b73-9fe0-86d782b59de3` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-f5dd9d0e-4743-4cfb-a319-3bc20a5f06f0` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 32 | `qa-3dfcd0cd-343b-42b4-8947-af6cf810d65a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-250e1982-b0f5-4083-8f68-226691c36c9d` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-672c1783-2895-4ba9-9daf-cca619f7f045` |
| 10 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-f1b1e861-bd30-403d-9429-aed38f543e9d` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-3f7cba83-76a5-4442-b2b5-717afa559417` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-591fc075-d3f8-447e-bf20-f539cb839e07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-591fc075-d3f8-447e-bf20-f539cb839e07
Content-Type: application/json

--- request body ---
{"handle":"qa-37935fd04be8","displayName":"QA 37935fd04be8","password":"****","region":"eu"}

--- response: 201 in 442 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-591fc075-d3f8-447e-bf20-f539cb839e07
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
Location: /v1/accounts/qa-37935fd04be8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3af640cd-dc66-44d7-93f4-4ee683f25fe1","handle":"qa-37935fd04be8","displayName":"QA 37935fd04be8","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.294905938Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-60052e9b-e0ef-49d4-aaac-b0e33d01676f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60052e9b-e0ef-49d4-aaac-b0e33d01676f
Content-Type: application/json

--- request body ---
{"handle":"qa-1bed1c327fcc","displayName":"QA 1bed1c327fcc","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-60052e9b-e0ef-49d4-aaac-b0e33d01676f
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
Location: /v1/accounts/qa-1bed1c327fcc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e4a3d68-0a86-43f0-8b91-9cb4bc049024","handle":"qa-1bed1c327fcc","displayName":"QA 1bed1c327fcc","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.740501690Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cbf3f0be-a21c-4782-a241-c3239259e75f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbf3f0be-a21c-4782-a241-c3239259e75f
Content-Type: application/json

--- request body ---
{"handle":"qa-37935fd04be8","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbf3f0be-a21c-4782-a241-c3239259e75f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3af640cd-dc66-44d7-93f4-4ee683f25fe1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7cea66c2-de97-4437-a048-70a78794e068

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cea66c2-de97-4437-a048-70a78794e068
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1bed1c327fcc","subject":"Quick question","message":"Hi"}

--- response: 201 in 77 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cea66c2-de97-4437-a048-70a78794e068
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
Location: /v1/conversations/cnv_a76f12d7-4fcd-4b3d-ab1e-77b967de89c4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a76f12d7-4fcd-4b3d-ab1e-77b967de89c4","subject":"Quick question","status":"open","region":"eu","participants":["qa-37935fd04be8","qa-1bed1c327fcc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.917492507Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_a76f12d7-4fcd-4b3d-ab1e-77b967de89c4/close
correlation: qa-2cc7bab9-1dac-4b73-9fe0-86d782b59de3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cc7bab9-1dac-4b73-9fe0-86d782b59de3
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cc7bab9-1dac-4b73-9fe0-86d782b59de3
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
Content-Length: 283

{"id":"cnv_a76f12d7-4fcd-4b3d-ab1e-77b967de89c4","subject":"Quick question","status":"closed","region":"eu","participants":["qa-37935fd04be8","qa-1bed1c327fcc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.917492507Z","closedAt":"2026-11-01T09:23:25.040757803Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f5dd9d0e-4743-4cfb-a319-3bc20a5f06f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5dd9d0e-4743-4cfb-a319-3bc20a5f06f0
Content-Type: application/json

--- request body ---
{"handle":"qa-1bed1c327fcc","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5dd9d0e-4743-4cfb-a319-3bc20a5f06f0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e4a3d68-0a86-43f0-8b91-9cb4bc049024"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_a76f12d7-4fcd-4b3d-ab1e-77b967de89c4/messages
correlation: qa-3dfcd0cd-343b-42b4-8947-af6cf810d65a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dfcd0cd-343b-42b4-8947-af6cf810d65a
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 32 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3dfcd0cd-343b-42b4-8947-af6cf810d65a
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
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_a76f12d7-4fcd-4b3d-ab1e-77b967de89c4/messages","correlationId":"qa-3dfcd0cd-343b-42b4-8947-af6cf810d65a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-250e1982-b0f5-4083-8f68-226691c36c9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-250e1982-b0f5-4083-8f68-226691c36c9d
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-250e1982-b0f5-4083-8f68-226691c36c9d
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
correlation: qa-672c1783-2895-4ba9-9daf-cca619f7f045

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-672c1783-2895-4ba9-9daf-cca619f7f045
Content-Type: application/json

--- request body ---
{"handle":"qa-1bed1c327fcc","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-672c1783-2895-4ba9-9daf-cca619f7f045
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-672c1783-2895-4ba9-9daf-cca619f7f045"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f1b1e861-bd30-403d-9429-aed38f543e9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1b1e861-bd30-403d-9429-aed38f543e9d
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f1b1e861-bd30-403d-9429-aed38f543e9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 9
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-3f7cba83-76a5-4442-b2b5-717afa559417

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f7cba83-76a5-4442-b2b5-717afa559417
Content-Type: application/json

--- request body ---
{"handle":"qa-37935fd04be8","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f7cba83-76a5-4442-b2b5-717afa559417
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3f7cba83-76a5-4442-b2b5-717afa559417"}
```
