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
| 1 | `POST /v1/accounts` | 201 | 282 | `qa-3a5aa09a-c6eb-4501-92c2-9f535d0e884e` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-bfe2c30a-ad8f-4602-8f85-b3e3f204dfd7` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-fd681af6-6029-43c3-bbfa-38f5e74dbf7a` |
| 4 | `POST /v1/conversations` | 201 | 51 | `qa-02be3ea7-b084-488a-9a1e-c55ad6096e54` |
| 5 | `GET /v1/conversations` | 200 | 22 | `qa-d54f3744-b852-4cca-abdc-e2ca96bac3a3` |
| 6 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-2be2c3b9-642a-4f5d-bd5c-621fdc52c41e` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-fb1808a0-2412-4a2c-aa35-603827450e52` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 11 | `qa-e5d6d067-5e37-49f6-886f-11885ac6356f` |
| 9 | `POST /v1/auth/token` | 200 | 17 | `qa-3c69f66e-16ba-408a-8b86-de2744e07112` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 10 | `qa-b0695233-cdb2-4a8d-9b05-f22e265a9086` |
| 11 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-223e7a24-50f1-4ad4-9c76-f805da1b59af` |
| 12 | `POST /v1/auth/token` | 401 | 10 | `qa-619a689f-a848-43f0-8c2d-6335ba49692a` |
| 13 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-e3c79b9c-86d0-455a-b105-04a2041c36fd` |
| 14 | `POST /v1/auth/token` | 401 | 7 | `qa-b2a2e4ed-6537-4341-be46-92bd54d2bbdf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3a5aa09a-c6eb-4501-92c2-9f535d0e884e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a5aa09a-c6eb-4501-92c2-9f535d0e884e
Content-Type: application/json

--- request body ---
{"handle":"qa-2b2ceb518840","displayName":"QA 2b2ceb518840","password":"****","region":"eu"}

--- response: 201 in 282 ms ---
Date: Wed, 18 Nov 2026 10:19:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a5aa09a-c6eb-4501-92c2-9f535d0e884e
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
Location: /v1/accounts/qa-2b2ceb518840
X-Served-Region: eu
Content-Length: 181

{"id":"acc_97ca0e39-fde4-4f03-abfa-981c4219834e","handle":"qa-2b2ceb518840","displayName":"QA 2b2ceb518840","region":"eu","role":"user","createdAt":"2026-11-18T10:19:49.638580908Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bfe2c30a-ad8f-4602-8f85-b3e3f204dfd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfe2c30a-ad8f-4602-8f85-b3e3f204dfd7
Content-Type: application/json

--- request body ---
{"handle":"qa-c01624ae6ed7","displayName":"QA c01624ae6ed7","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfe2c30a-ad8f-4602-8f85-b3e3f204dfd7
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
Location: /v1/accounts/qa-c01624ae6ed7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1ddbce54-6cc4-4116-a360-980b41366d71","handle":"qa-c01624ae6ed7","displayName":"QA c01624ae6ed7","region":"eu","role":"user","createdAt":"2026-11-18T10:19:49.976575956Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fd681af6-6029-43c3-bbfa-38f5e74dbf7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd681af6-6029-43c3-bbfa-38f5e74dbf7a
Content-Type: application/json

--- request body ---
{"handle":"qa-2b2ceb518840","password":"****"}

--- response: 200 in 29 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd681af6-6029-43c3-bbfa-38f5e74dbf7a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_97ca0e39-fde4-4f03-abfa-981c4219834e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-02be3ea7-b084-488a-9a1e-c55ad6096e54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02be3ea7-b084-488a-9a1e-c55ad6096e54
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c01624ae6ed7","subject":"Contract check","message":"Hello"}

--- response: 201 in 51 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-02be3ea7-b084-488a-9a1e-c55ad6096e54
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
Location: /v1/conversations/cnv_1b028230-7aee-407b-907c-1f68f11136bc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1b028230-7aee-407b-907c-1f68f11136bc","subject":"Contract check","status":"open","region":"eu","participants":["qa-2b2ceb518840","qa-c01624ae6ed7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.113475345Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-d54f3744-b852-4cca-abdc-e2ca96bac3a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d54f3744-b852-4cca-abdc-e2ca96bac3a3
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-d54f3744-b852-4cca-abdc-e2ca96bac3a3
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

{"items":[{"id":"cnv_1b028230-7aee-407b-907c-1f68f11136bc","subject":"Contract check","status":"open","region":"eu","participants":["qa-2b2ceb518840","qa-c01624ae6ed7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.113475345Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_1b028230-7aee-407b-907c-1f68f11136bc
correlation: qa-2be2c3b9-642a-4f5d-bd5c-621fdc52c41e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2be2c3b9-642a-4f5d-bd5c-621fdc52c41e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-2be2c3b9-642a-4f5d-bd5c-621fdc52c41e
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

{"id":"cnv_1b028230-7aee-407b-907c-1f68f11136bc","subject":"Contract check","status":"open","region":"eu","participants":["qa-2b2ceb518840","qa-c01624ae6ed7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:50.113475345Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_1b028230-7aee-407b-907c-1f68f11136bc/messages
correlation: qa-fb1808a0-2412-4a2c-aa35-603827450e52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb1808a0-2412-4a2c-aa35-603827450e52
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb1808a0-2412-4a2c-aa35-603827450e52
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

{"id":"msg_d3473911-20ab-4fe2-b698-2069fb783fa4","conversationId":"cnv_1b028230-7aee-407b-907c-1f68f11136bc","sender":"qa-2b2ceb518840","body":"Second","createdAt":"2026-11-18T10:19:50.245428371Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_1b028230-7aee-407b-907c-1f68f11136bc/messages
correlation: qa-e5d6d067-5e37-49f6-886f-11885ac6356f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5d6d067-5e37-49f6-886f-11885ac6356f
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5d6d067-5e37-49f6-886f-11885ac6356f
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

{"items":[{"id":"msg_79f80c4a-846b-4f22-b866-5174406958c3","conversationId":"cnv_1b028230-7aee-407b-907c-1f68f11136bc","sender":"qa-2b2ceb518840","body":"Hello","createdAt":"2026-11-18T10:19:50.115465458Z"},{"id":"msg_d3473911-20ab-4fe2-b698-2069fb783fa4","conversationId":"cnv_1b028230-7aee-407b-907c-1f68f11136bc","sender":"qa-2b2ceb518840","body":"Second","createdAt":"2026-11-18T10:19:50.245428371Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-3c69f66e-16ba-408a-8b86-de2744e07112

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c69f66e-16ba-408a-8b86-de2744e07112
Content-Type: application/json

--- request body ---
{"handle":"qa-c01624ae6ed7","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c69f66e-16ba-408a-8b86-de2744e07112
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1ddbce54-6cc4-4116-a360-980b41366d71"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_1b028230-7aee-407b-907c-1f68f11136bc/read
correlation: qa-b0695233-cdb2-4a8d-9b05-f22e265a9086

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0695233-cdb2-4a8d-9b05-f22e265a9086
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0695233-cdb2-4a8d-9b05-f22e265a9086
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

{"conversationId":"cnv_1b028230-7aee-407b-907c-1f68f11136bc","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-223e7a24-50f1-4ad4-9c76-f805da1b59af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-223e7a24-50f1-4ad4-9c76-f805da1b59af
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-223e7a24-50f1-4ad4-9c76-f805da1b59af
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
correlation: qa-619a689f-a848-43f0-8c2d-6335ba49692a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-619a689f-a848-43f0-8c2d-6335ba49692a
Content-Type: application/json

--- request body ---
{"handle":"qa-c01624ae6ed7","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-619a689f-a848-43f0-8c2d-6335ba49692a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-619a689f-a848-43f0-8c2d-6335ba49692a"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3c79b9c-86d0-455a-b105-04a2041c36fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3c79b9c-86d0-455a-b105-04a2041c36fd
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3c79b9c-86d0-455a-b105-04a2041c36fd
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
correlation: qa-b2a2e4ed-6537-4341-be46-92bd54d2bbdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2a2e4ed-6537-4341-be46-92bd54d2bbdf
Content-Type: application/json

--- request body ---
{"handle":"qa-2b2ceb518840","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2a2e4ed-6537-4341-be46-92bd54d2bbdf
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b2a2e4ed-6537-4341-be46-92bd54d2bbdf"}
```
