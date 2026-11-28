# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 362 | `qa-33582ead-f35c-40fa-aa14-790d0d994a3d` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-2633d211-a1b6-4a06-8346-ba5639d34bb2` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-8096f77d-f578-450a-a6bb-93cbc316e407` |
| 4 | `POST /v1/conversations` | 201 | 38 | `qa-83e5198d-65b7-44bb-888e-2b76473131c4` |
| 5 | `GET /v1/conversations` | 200 | 13 | `qa-d46a3dd6-6abe-47c9-a113-caafba5e04bb` |
| 6 | `GET /v1/conversations/{id}` | 200 | 9 | `qa-8072fdca-8bad-48c5-a561-f0b21b69be58` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-e8f08e1d-ffde-4df6-b4e1-1bec7a15b3c7` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 10 | `qa-2c335ce4-da17-4fed-9ff1-d890c65a50e4` |
| 9 | `POST /v1/auth/token` | 200 | 25 | `qa-49842c15-66b3-4df3-8932-1e74af438d16` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 13 | `qa-a579b1aa-e941-46bc-8b66-2b8d93774ec4` |
| 11 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-9cf0a87a-ca2a-4907-b3bc-fcbfed7ca3fa` |
| 12 | `POST /v1/auth/token` | 401 | 9 | `qa-87c6fbe8-2e94-42a4-aa3c-bf05a9a25b2e` |
| 13 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-ac8d7bd1-8dd1-43bb-bec6-145aa0f1f931` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-523eed95-20cf-4fa9-9899-bc14fb577c8c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-33582ead-f35c-40fa-aa14-790d0d994a3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33582ead-f35c-40fa-aa14-790d0d994a3d
Content-Type: application/json

--- request body ---
{"handle":"qa-9369d80d13ab","displayName":"QA 9369d80d13ab","password":"****","region":"eu"}

--- response: 201 in 362 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-33582ead-f35c-40fa-aa14-790d0d994a3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-9369d80d13ab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b329b6b2-ae8d-427b-a576-a4817e9da90b","handle":"qa-9369d80d13ab","displayName":"QA 9369d80d13ab","region":"eu","role":"user","createdAt":"2026-11-24T12:38:12.209325619Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2633d211-a1b6-4a06-8346-ba5639d34bb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2633d211-a1b6-4a06-8346-ba5639d34bb2
Content-Type: application/json

--- request body ---
{"handle":"qa-f304dbbb31bb","displayName":"QA f304dbbb31bb","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-2633d211-a1b6-4a06-8346-ba5639d34bb2
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
Location: /v1/accounts/qa-f304dbbb31bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5be65dea-42b2-4a03-ac7d-3044bf16eed5","handle":"qa-f304dbbb31bb","displayName":"QA f304dbbb31bb","region":"eu","role":"user","createdAt":"2026-11-24T12:38:12.635921455Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8096f77d-f578-450a-a6bb-93cbc316e407

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8096f77d-f578-450a-a6bb-93cbc316e407
Content-Type: application/json

--- request body ---
{"handle":"qa-9369d80d13ab","password":"****"}

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8096f77d-f578-450a-a6bb-93cbc316e407
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b329b6b2-ae8d-427b-a576-a4817e9da90b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-83e5198d-65b7-44bb-888e-2b76473131c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83e5198d-65b7-44bb-888e-2b76473131c4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f304dbbb31bb","subject":"Contract check","message":"Hello"}

--- response: 201 in 38 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-83e5198d-65b7-44bb-888e-2b76473131c4
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
Location: /v1/conversations/cnv_d3332d50-18f4-4eac-94d6-0fa4129c0439
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d3332d50-18f4-4eac-94d6-0fa4129c0439","subject":"Contract check","status":"open","region":"eu","participants":["qa-9369d80d13ab","qa-f304dbbb31bb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:12.729192486Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-d46a3dd6-6abe-47c9-a113-caafba5e04bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d46a3dd6-6abe-47c9-a113-caafba5e04bb
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d46a3dd6-6abe-47c9-a113-caafba5e04bb
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
Content-Length: 259

{"items":[{"id":"cnv_d3332d50-18f4-4eac-94d6-0fa4129c0439","subject":"Contract check","status":"open","region":"eu","participants":["qa-9369d80d13ab","qa-f304dbbb31bb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:12.729192486Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_d3332d50-18f4-4eac-94d6-0fa4129c0439
correlation: qa-8072fdca-8bad-48c5-a561-f0b21b69be58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8072fdca-8bad-48c5-a561-f0b21b69be58
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8072fdca-8bad-48c5-a561-f0b21b69be58
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d3332d50-18f4-4eac-94d6-0fa4129c0439","subject":"Contract check","status":"open","region":"eu","participants":["qa-9369d80d13ab","qa-f304dbbb31bb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:12.729192486Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_d3332d50-18f4-4eac-94d6-0fa4129c0439/messages
correlation: qa-e8f08e1d-ffde-4df6-b4e1-1bec7a15b3c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8f08e1d-ffde-4df6-b4e1-1bec7a15b3c7
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8f08e1d-ffde-4df6-b4e1-1bec7a15b3c7
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
Content-Length: 197

{"id":"msg_17606848-48d3-4e19-b990-ddb5d15b3004","conversationId":"cnv_d3332d50-18f4-4eac-94d6-0fa4129c0439","sender":"qa-9369d80d13ab","body":"Second","createdAt":"2026-11-24T12:38:12.858469136Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_d3332d50-18f4-4eac-94d6-0fa4129c0439/messages
correlation: qa-2c335ce4-da17-4fed-9ff1-d890c65a50e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c335ce4-da17-4fed-9ff1-d890c65a50e4
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c335ce4-da17-4fed-9ff1-d890c65a50e4
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
Content-Length: 416

{"items":[{"id":"msg_ef08d98c-10b0-48fc-8b5b-a23cc1be844d","conversationId":"cnv_d3332d50-18f4-4eac-94d6-0fa4129c0439","sender":"qa-9369d80d13ab","body":"Hello","createdAt":"2026-11-24T12:38:12.729438550Z"},{"id":"msg_17606848-48d3-4e19-b990-ddb5d15b3004","conversationId":"cnv_d3332d50-18f4-4eac-94d6-0fa4129c0439","sender":"qa-9369d80d13ab","body":"Second","createdAt":"2026-11-24T12:38:12.858469136Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-49842c15-66b3-4df3-8932-1e74af438d16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49842c15-66b3-4df3-8932-1e74af438d16
Content-Type: application/json

--- request body ---
{"handle":"qa-f304dbbb31bb","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-49842c15-66b3-4df3-8932-1e74af438d16
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5be65dea-42b2-4a03-ac7d-3044bf16eed5"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_d3332d50-18f4-4eac-94d6-0fa4129c0439/read
correlation: qa-a579b1aa-e941-46bc-8b66-2b8d93774ec4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a579b1aa-e941-46bc-8b66-2b8d93774ec4
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-a579b1aa-e941-46bc-8b66-2b8d93774ec4
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
Content-Length: 77

{"conversationId":"cnv_d3332d50-18f4-4eac-94d6-0fa4129c0439","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9cf0a87a-ca2a-4907-b3bc-fcbfed7ca3fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cf0a87a-ca2a-4907-b3bc-fcbfed7ca3fa
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9cf0a87a-ca2a-4907-b3bc-fcbfed7ca3fa
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-87c6fbe8-2e94-42a4-aa3c-bf05a9a25b2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87c6fbe8-2e94-42a4-aa3c-bf05a9a25b2e
Content-Type: application/json

--- request body ---
{"handle":"qa-f304dbbb31bb","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-87c6fbe8-2e94-42a4-aa3c-bf05a9a25b2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-87c6fbe8-2e94-42a4-aa3c-bf05a9a25b2e"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ac8d7bd1-8dd1-43bb-bec6-145aa0f1f931

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac8d7bd1-8dd1-43bb-bec6-145aa0f1f931
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ac8d7bd1-8dd1-43bb-bec6-145aa0f1f931
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
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-523eed95-20cf-4fa9-9899-bc14fb577c8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-523eed95-20cf-4fa9-9899-bc14fb577c8c
Content-Type: application/json

--- request body ---
{"handle":"qa-9369d80d13ab","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-523eed95-20cf-4fa9-9899-bc14fb577c8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-523eed95-20cf-4fa9-9899-bc14fb577c8c"}
```
