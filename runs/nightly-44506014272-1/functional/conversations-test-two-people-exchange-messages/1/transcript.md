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
| 1 | `POST /v1/accounts` | 201 | 275 | `qa-98ff5817-ccc3-4915-8106-ac39a24de1c7` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-cef10158-8fbe-4088-abbc-bcf001b0bbc3` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-9c51fb54-6bd7-48d6-8e12-be41b798a84d` |
| 4 | `POST /v1/conversations` | 201 | 51 | `qa-d1199219-b930-499a-ac59-e2e59a6306c3` |
| 5 | `POST /v1/auth/token` | 200 | 14 | `qa-2ae30485-3655-4263-aaf8-c5d1e19cc50c` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-a3489aed-f90e-411d-8c6c-59b99cf34aea` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 19 | `qa-f8fb3830-b344-4fe4-98ac-54e2af6c84b5` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-8d5cb05c-7242-477f-99e3-49b1ea88a310` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-8dd0688d-ba74-41d3-b3da-ca79d37a8b36` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-dc570228-fb13-444d-bc3b-d48da68aaf71` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-e7867067-7ebb-46e7-b2f2-ff051c495739` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-98ff5817-ccc3-4915-8106-ac39a24de1c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98ff5817-ccc3-4915-8106-ac39a24de1c7
Content-Type: application/json

--- request body ---
{"handle":"qa-15d675e7c675","displayName":"QA 15d675e7c675","password":"****","region":"eu"}

--- response: 201 in 275 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-98ff5817-ccc3-4915-8106-ac39a24de1c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
Location: /v1/accounts/qa-15d675e7c675
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d1b000ef-173d-4873-9937-8b677fed86b6","handle":"qa-15d675e7c675","displayName":"QA 15d675e7c675","region":"eu","role":"user","createdAt":"2026-11-19T10:29:18.143370946Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cef10158-8fbe-4088-abbc-bcf001b0bbc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cef10158-8fbe-4088-abbc-bcf001b0bbc3
Content-Type: application/json

--- request body ---
{"handle":"qa-5d88bea5d882","displayName":"QA 5d88bea5d882","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-cef10158-8fbe-4088-abbc-bcf001b0bbc3
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
Location: /v1/accounts/qa-5d88bea5d882
X-Served-Region: eu
Content-Length: 181

{"id":"acc_246b5887-7063-464f-9fcc-8c0e9a0a743d","handle":"qa-5d88bea5d882","displayName":"QA 5d88bea5d882","region":"eu","role":"user","createdAt":"2026-11-19T10:29:18.404629916Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9c51fb54-6bd7-48d6-8e12-be41b798a84d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c51fb54-6bd7-48d6-8e12-be41b798a84d
Content-Type: application/json

--- request body ---
{"handle":"qa-15d675e7c675","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c51fb54-6bd7-48d6-8e12-be41b798a84d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d1b000ef-173d-4873-9937-8b677fed86b6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d1199219-b930-499a-ac59-e2e59a6306c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1199219-b930-499a-ac59-e2e59a6306c3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5d88bea5d882","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 51 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1199219-b930-499a-ac59-e2e59a6306c3
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
Location: /v1/conversations/cnv_bd3edab4-73c1-4f06-a6e1-e3cba9084b3c
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_bd3edab4-73c1-4f06-a6e1-e3cba9084b3c","subject":"Lunch?","status":"open","region":"eu","participants":["qa-15d675e7c675","qa-5d88bea5d882"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:18.549743818Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2ae30485-3655-4263-aaf8-c5d1e19cc50c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ae30485-3655-4263-aaf8-c5d1e19cc50c
Content-Type: application/json

--- request body ---
{"handle":"qa-5d88bea5d882","password":"****"}

--- response: 200 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ae30485-3655-4263-aaf8-c5d1e19cc50c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_246b5887-7063-464f-9fcc-8c0e9a0a743d"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_bd3edab4-73c1-4f06-a6e1-e3cba9084b3c/messages
correlation: qa-a3489aed-f90e-411d-8c6c-59b99cf34aea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3489aed-f90e-411d-8c6c-59b99cf34aea
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3489aed-f90e-411d-8c6c-59b99cf34aea
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

{"id":"msg_1cfc7599-4d0d-4447-ae6b-2d89227386c1","conversationId":"cnv_bd3edab4-73c1-4f06-a6e1-e3cba9084b3c","sender":"qa-5d88bea5d882","body":"Friday works","createdAt":"2026-11-19T10:29:18.615781982Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_bd3edab4-73c1-4f06-a6e1-e3cba9084b3c/messages
correlation: qa-f8fb3830-b344-4fe4-98ac-54e2af6c84b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8fb3830-b344-4fe4-98ac-54e2af6c84b5
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8fb3830-b344-4fe4-98ac-54e2af6c84b5
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

{"items":[{"id":"msg_c7db7e51-2139-4b3e-bc65-b73b776611ec","conversationId":"cnv_bd3edab4-73c1-4f06-a6e1-e3cba9084b3c","sender":"qa-15d675e7c675","body":"Free on Friday?","createdAt":"2026-11-19T10:29:18.549947220Z"},{"id":"msg_1cfc7599-4d0d-4447-ae6b-2d89227386c1","conversationId":"cnv_bd3edab4-73c1-4f06-a6e1-e3cba9084b3c","sender":"qa-5d88bea5d882","body":"Friday works","createdAt":"2026-11-19T10:29:18.615781982Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8d5cb05c-7242-477f-99e3-49b1ea88a310

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d5cb05c-7242-477f-99e3-49b1ea88a310
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8d5cb05c-7242-477f-99e3-49b1ea88a310
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
correlation: qa-8dd0688d-ba74-41d3-b3da-ca79d37a8b36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dd0688d-ba74-41d3-b3da-ca79d37a8b36
Content-Type: application/json

--- request body ---
{"handle":"qa-5d88bea5d882","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8dd0688d-ba74-41d3-b3da-ca79d37a8b36
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8dd0688d-ba74-41d3-b3da-ca79d37a8b36"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dc570228-fb13-444d-bc3b-d48da68aaf71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc570228-fb13-444d-bc3b-d48da68aaf71
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dc570228-fb13-444d-bc3b-d48da68aaf71
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
correlation: qa-e7867067-7ebb-46e7-b2f2-ff051c495739

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7867067-7ebb-46e7-b2f2-ff051c495739
Content-Type: application/json

--- request body ---
{"handle":"qa-15d675e7c675","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7867067-7ebb-46e7-b2f2-ff051c495739
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e7867067-7ebb-46e7-b2f2-ff051c495739"}
```
