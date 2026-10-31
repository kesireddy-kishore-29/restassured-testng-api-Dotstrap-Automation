# Transcript: Someone outside a conversation gets 403, not its content

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#outsiderCannotReadOrWriteAConversation` |
| Features | FEAT-AUTHZ-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 446 | `qa-5796b9e4-5f28-442c-818d-225301136a9c` |
| 2 | `POST /v1/accounts` | 201 | 68 | `qa-694a18cf-61c9-4ce2-a10c-ba4c865d5bec` |
| 3 | `POST /v1/accounts` | 201 | 29 | `qa-658a57b8-fcda-447f-9503-3c27056801f0` |
| 4 | `POST /v1/auth/token` | 200 | 26 | `qa-6be7abc8-0795-4d6a-ac57-fcc6d054c970` |
| 5 | `POST /v1/conversations` | 201 | 39 | `qa-b4a8eb37-49e0-4b4f-88c7-f8b73d22c0bf` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-e203567c-7887-404f-a9b2-e118d2d9e5fb` |
| 7 | `GET /v1/conversations/{id}` | 403 | 18 | `qa-9d475334-e415-4197-9343-940f761c4438` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 18 | `qa-3e395f18-b7c2-4523-9e20-53a2ac4ee84c` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 16 | `qa-bb5a57ff-30af-4dd5-af06-9480dfea8555` |
| 10 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-9e7b9a34-bb20-40bd-bcc8-4010a896a590` |
| 11 | `POST /v1/auth/token` | 401 | 18 | `qa-314062c6-a708-41e2-879d-eaec357b01da` |
| 12 | `POST /v1/auth/token` | 200 | 27 | `qa-de7abefc-70fa-46cb-8a56-5edd344026d2` |
| 13 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-64492eae-c938-47d3-a234-be5ded9e5acc` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-98ea89b7-a3c7-4c85-929c-edd963511e3f` |
| 15 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-89be70cc-1d25-47c4-bcef-310866c3203c` |
| 16 | `POST /v1/auth/token` | 401 | 16 | `qa-6d363ae7-6f03-4ad4-9de5-526589ace232` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5796b9e4-5f28-442c-818d-225301136a9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5796b9e4-5f28-442c-818d-225301136a9c
Content-Type: application/json

--- request body ---
{"handle":"qa-caadbe508d79","displayName":"QA caadbe508d79","password":"****","region":"eu"}

--- response: 201 in 446 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5796b9e4-5f28-442c-818d-225301136a9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-caadbe508d79
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f75503e9-5f95-416d-b76c-830a59a5dc13","handle":"qa-caadbe508d79","displayName":"QA caadbe508d79","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.908168171Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-694a18cf-61c9-4ce2-a10c-ba4c865d5bec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-694a18cf-61c9-4ce2-a10c-ba4c865d5bec
Content-Type: application/json

--- request body ---
{"handle":"qa-b33609de26b5","displayName":"QA b33609de26b5","password":"****","region":"eu"}

--- response: 201 in 68 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-694a18cf-61c9-4ce2-a10c-ba4c865d5bec
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
Location: /v1/accounts/qa-b33609de26b5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ab574d65-7283-4e5e-b086-518068ca8000","handle":"qa-b33609de26b5","displayName":"QA b33609de26b5","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.422181159Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-658a57b8-fcda-447f-9503-3c27056801f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-658a57b8-fcda-447f-9503-3c27056801f0
Content-Type: application/json

--- request body ---
{"handle":"qa-11c64a0ca5db","displayName":"QA 11c64a0ca5db","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-658a57b8-fcda-447f-9503-3c27056801f0
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
Location: /v1/accounts/qa-11c64a0ca5db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92fd2a2d-4af9-416d-a325-b72558a144c0","handle":"qa-11c64a0ca5db","displayName":"QA 11c64a0ca5db","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.473330670Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-6be7abc8-0795-4d6a-ac57-fcc6d054c970

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6be7abc8-0795-4d6a-ac57-fcc6d054c970
Content-Type: application/json

--- request body ---
{"handle":"qa-caadbe508d79","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-6be7abc8-0795-4d6a-ac57-fcc6d054c970
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f75503e9-5f95-416d-b76c-830a59a5dc13"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-b4a8eb37-49e0-4b4f-88c7-f8b73d22c0bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4a8eb37-49e0-4b4f-88c7-f8b73d22c0bf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b33609de26b5","subject":"Private","message":"Just us"}

--- response: 201 in 39 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4a8eb37-49e0-4b4f-88c7-f8b73d22c0bf
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
Location: /v1/conversations/cnv_15d8892f-3cba-424b-96bb-0305e4a76b0b
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_15d8892f-3cba-424b-96bb-0305e4a76b0b","subject":"Private","status":"open","region":"eu","participants":["qa-caadbe508d79","qa-b33609de26b5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.591706098Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e203567c-7887-404f-a9b2-e118d2d9e5fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e203567c-7887-404f-a9b2-e118d2d9e5fb
Content-Type: application/json

--- request body ---
{"handle":"qa-11c64a0ca5db","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e203567c-7887-404f-a9b2-e118d2d9e5fb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_92fd2a2d-4af9-416d-a325-b72558a144c0"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_15d8892f-3cba-424b-96bb-0305e4a76b0b
correlation: qa-9d475334-e415-4197-9343-940f761c4438

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d475334-e415-4197-9343-940f761c4438
Content-Type: application/json

--- response: 403 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d475334-e415-4197-9343-940f761c4438
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_15d8892f-3cba-424b-96bb-0305e4a76b0b","correlationId":"qa-9d475334-e415-4197-9343-940f761c4438"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_15d8892f-3cba-424b-96bb-0305e4a76b0b/messages
correlation: qa-3e395f18-b7c2-4523-9e20-53a2ac4ee84c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e395f18-b7c2-4523-9e20-53a2ac4ee84c
Content-Type: application/json

--- response: 403 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e395f18-b7c2-4523-9e20-53a2ac4ee84c
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_15d8892f-3cba-424b-96bb-0305e4a76b0b/messages","correlationId":"qa-3e395f18-b7c2-4523-9e20-53a2ac4ee84c"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_15d8892f-3cba-424b-96bb-0305e4a76b0b/messages
correlation: qa-bb5a57ff-30af-4dd5-af06-9480dfea8555

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb5a57ff-30af-4dd5-af06-9480dfea8555
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb5a57ff-30af-4dd5-af06-9480dfea8555
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_15d8892f-3cba-424b-96bb-0305e4a76b0b/messages","correlationId":"qa-bb5a57ff-30af-4dd5-af06-9480dfea8555"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9e7b9a34-bb20-40bd-bcc8-4010a896a590

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e7b9a34-bb20-40bd-bcc8-4010a896a590
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9e7b9a34-bb20-40bd-bcc8-4010a896a590
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
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-314062c6-a708-41e2-879d-eaec357b01da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-314062c6-a708-41e2-879d-eaec357b01da
Content-Type: application/json

--- request body ---
{"handle":"qa-11c64a0ca5db","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-314062c6-a708-41e2-879d-eaec357b01da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-314062c6-a708-41e2-879d-eaec357b01da"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-de7abefc-70fa-46cb-8a56-5edd344026d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de7abefc-70fa-46cb-8a56-5edd344026d2
Content-Type: application/json

--- request body ---
{"handle":"qa-b33609de26b5","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-de7abefc-70fa-46cb-8a56-5edd344026d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ab574d65-7283-4e5e-b086-518068ca8000"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-64492eae-c938-47d3-a234-be5ded9e5acc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64492eae-c938-47d3-a234-be5ded9e5acc
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-64492eae-c938-47d3-a234-be5ded9e5acc
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
correlation: qa-98ea89b7-a3c7-4c85-929c-edd963511e3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98ea89b7-a3c7-4c85-929c-edd963511e3f
Content-Type: application/json

--- request body ---
{"handle":"qa-b33609de26b5","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98ea89b7-a3c7-4c85-929c-edd963511e3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-98ea89b7-a3c7-4c85-929c-edd963511e3f"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-89be70cc-1d25-47c4-bcef-310866c3203c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89be70cc-1d25-47c4-bcef-310866c3203c
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-89be70cc-1d25-47c4-bcef-310866c3203c
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-6d363ae7-6f03-4ad4-9de5-526589ace232

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d363ae7-6f03-4ad4-9de5-526589ace232
Content-Type: application/json

--- request body ---
{"handle":"qa-caadbe508d79","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d363ae7-6f03-4ad4-9de5-526589ace232
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6d363ae7-6f03-4ad4-9de5-526589ace232"}
```
