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
| 1 | `POST /v1/accounts` | 201 | 305 | `qa-eb72c356-547f-44c0-ae3e-07f1a80e1730` |
| 2 | `POST /v1/accounts` | 201 | 60 | `qa-a015a919-3e9e-47b8-bd1a-2693276a341c` |
| 3 | `POST /v1/accounts` | 201 | 22 | `qa-12bc3e5a-2f6f-4dc5-97b3-e5923b90b23c` |
| 4 | `POST /v1/auth/token` | 200 | 21 | `qa-22100147-12de-4b67-92a2-fadd350e3da1` |
| 5 | `POST /v1/conversations` | 201 | 32 | `qa-24e099cc-5c8e-4bc0-9726-4f8367b2578a` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-de8012f3-518c-4ebf-a508-6c05c25109ad` |
| 7 | `GET /v1/conversations/{id}` | 403 | 17 | `qa-d13c1018-e085-4402-b068-8f88b2754d12` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 14 | `qa-1e183758-04c7-478b-ab6e-64605d7c414e` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 8 | `qa-4cc415eb-5621-4a55-97dd-f64b0aa19409` |
| 10 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-5bf667ac-7b6b-4ca4-b815-8cfdfe11a2fa` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-291633a4-93fa-4ac3-825b-49b35c199216` |
| 12 | `POST /v1/auth/token` | 200 | 10 | `qa-d8555088-31fa-4240-8d46-5d17847b6d06` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-988fb142-c9cc-4c31-91a4-2aff723e64bd` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-513e4aff-1027-41c0-8246-85d08bc7c624` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-d3245cea-92b5-41e9-9f83-5be48552537a` |
| 16 | `POST /v1/auth/token` | 401 | 5 | `qa-2cb63ad4-7850-4fae-88d2-36d22573aa93` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eb72c356-547f-44c0-ae3e-07f1a80e1730

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb72c356-547f-44c0-ae3e-07f1a80e1730
Content-Type: application/json

--- request body ---
{"handle":"qa-7036c4a36c0d","displayName":"QA 7036c4a36c0d","password":"****","region":"eu"}

--- response: 201 in 305 ms ---
Date: Mon, 23 Nov 2026 10:54:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb72c356-547f-44c0-ae3e-07f1a80e1730
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
Location: /v1/accounts/qa-7036c4a36c0d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6130214f-31ab-4b88-9c7a-bba2e043fc9b","handle":"qa-7036c4a36c0d","displayName":"QA 7036c4a36c0d","region":"eu","role":"user","createdAt":"2026-11-23T10:54:52.578816061Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a015a919-3e9e-47b8-bd1a-2693276a341c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a015a919-3e9e-47b8-bd1a-2693276a341c
Content-Type: application/json

--- request body ---
{"handle":"qa-78714cc9c1ce","displayName":"QA 78714cc9c1ce","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Mon, 23 Nov 2026 10:54:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a015a919-3e9e-47b8-bd1a-2693276a341c
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
Location: /v1/accounts/qa-78714cc9c1ce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e94a8f35-ba0a-48c8-8c1d-8718cb5f5d73","handle":"qa-78714cc9c1ce","displayName":"QA 78714cc9c1ce","region":"eu","role":"user","createdAt":"2026-11-23T10:54:52.863881588Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-12bc3e5a-2f6f-4dc5-97b3-e5923b90b23c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12bc3e5a-2f6f-4dc5-97b3-e5923b90b23c
Content-Type: application/json

--- request body ---
{"handle":"qa-868ec94fc7c8","displayName":"QA 868ec94fc7c8","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 23 Nov 2026 10:54:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-12bc3e5a-2f6f-4dc5-97b3-e5923b90b23c
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
Location: /v1/accounts/qa-868ec94fc7c8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88c674d3-1b66-4330-b5db-087b3c0b0a63","handle":"qa-868ec94fc7c8","displayName":"QA 868ec94fc7c8","region":"eu","role":"user","createdAt":"2026-11-23T10:54:52.900436513Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-22100147-12de-4b67-92a2-fadd350e3da1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22100147-12de-4b67-92a2-fadd350e3da1
Content-Type: application/json

--- request body ---
{"handle":"qa-7036c4a36c0d","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 23 Nov 2026 10:54:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-22100147-12de-4b67-92a2-fadd350e3da1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6130214f-31ab-4b88-9c7a-bba2e043fc9b"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-24e099cc-5c8e-4bc0-9726-4f8367b2578a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24e099cc-5c8e-4bc0-9726-4f8367b2578a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-78714cc9c1ce","subject":"Private","message":"Just us"}

--- response: 201 in 32 ms ---
Date: Mon, 23 Nov 2026 10:54:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-24e099cc-5c8e-4bc0-9726-4f8367b2578a
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
Location: /v1/conversations/cnv_c9433b8f-65db-4fce-8d44-91a2f6666873
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_c9433b8f-65db-4fce-8d44-91a2f6666873","subject":"Private","status":"open","region":"eu","participants":["qa-7036c4a36c0d","qa-78714cc9c1ce"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:53.001655209Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-de8012f3-518c-4ebf-a508-6c05c25109ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de8012f3-518c-4ebf-a508-6c05c25109ad
Content-Type: application/json

--- request body ---
{"handle":"qa-868ec94fc7c8","password":"****"}

--- response: 200 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-de8012f3-518c-4ebf-a508-6c05c25109ad
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_88c674d3-1b66-4330-b5db-087b3c0b0a63"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_c9433b8f-65db-4fce-8d44-91a2f6666873
correlation: qa-d13c1018-e085-4402-b068-8f88b2754d12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d13c1018-e085-4402-b068-8f88b2754d12
Content-Type: application/json

--- response: 403 in 17 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d13c1018-e085-4402-b068-8f88b2754d12
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_c9433b8f-65db-4fce-8d44-91a2f6666873","correlationId":"qa-d13c1018-e085-4402-b068-8f88b2754d12"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_c9433b8f-65db-4fce-8d44-91a2f6666873/messages
correlation: qa-1e183758-04c7-478b-ab6e-64605d7c414e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e183758-04c7-478b-ab6e-64605d7c414e
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e183758-04c7-478b-ab6e-64605d7c414e
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_c9433b8f-65db-4fce-8d44-91a2f6666873/messages","correlationId":"qa-1e183758-04c7-478b-ab6e-64605d7c414e"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_c9433b8f-65db-4fce-8d44-91a2f6666873/messages
correlation: qa-4cc415eb-5621-4a55-97dd-f64b0aa19409

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cc415eb-5621-4a55-97dd-f64b0aa19409
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4cc415eb-5621-4a55-97dd-f64b0aa19409
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_c9433b8f-65db-4fce-8d44-91a2f6666873/messages","correlationId":"qa-4cc415eb-5621-4a55-97dd-f64b0aa19409"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5bf667ac-7b6b-4ca4-b815-8cfdfe11a2fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bf667ac-7b6b-4ca4-b815-8cfdfe11a2fa
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5bf667ac-7b6b-4ca4-b815-8cfdfe11a2fa
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
correlation: qa-291633a4-93fa-4ac3-825b-49b35c199216

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-291633a4-93fa-4ac3-825b-49b35c199216
Content-Type: application/json

--- request body ---
{"handle":"qa-868ec94fc7c8","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-291633a4-93fa-4ac3-825b-49b35c199216
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-291633a4-93fa-4ac3-825b-49b35c199216"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-d8555088-31fa-4240-8d46-5d17847b6d06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8555088-31fa-4240-8d46-5d17847b6d06
Content-Type: application/json

--- request body ---
{"handle":"qa-78714cc9c1ce","password":"****"}

--- response: 200 in 10 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8555088-31fa-4240-8d46-5d17847b6d06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e94a8f35-ba0a-48c8-8c1d-8718cb5f5d73"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-988fb142-c9cc-4c31-91a4-2aff723e64bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-988fb142-c9cc-4c31-91a4-2aff723e64bd
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-988fb142-c9cc-4c31-91a4-2aff723e64bd
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
correlation: qa-513e4aff-1027-41c0-8246-85d08bc7c624

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-513e4aff-1027-41c0-8246-85d08bc7c624
Content-Type: application/json

--- request body ---
{"handle":"qa-78714cc9c1ce","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-513e4aff-1027-41c0-8246-85d08bc7c624
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-513e4aff-1027-41c0-8246-85d08bc7c624"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d3245cea-92b5-41e9-9f83-5be48552537a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3245cea-92b5-41e9-9f83-5be48552537a
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d3245cea-92b5-41e9-9f83-5be48552537a
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-2cb63ad4-7850-4fae-88d2-36d22573aa93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cb63ad4-7850-4fae-88d2-36d22573aa93
Content-Type: application/json

--- request body ---
{"handle":"qa-7036c4a36c0d","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2cb63ad4-7850-4fae-88d2-36d22573aa93
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2cb63ad4-7850-4fae-88d2-36d22573aa93"}
```
