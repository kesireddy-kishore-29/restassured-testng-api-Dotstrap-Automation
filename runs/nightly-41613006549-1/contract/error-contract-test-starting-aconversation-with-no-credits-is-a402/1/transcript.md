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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-53af9216-52b9-47a9-b6ee-8be7dde9ee96` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-7c72998c-66d8-444c-b50f-604625f0a9c2` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-78c8a2d9-ebf5-4021-9843-13875b995248` |
| 4 | `POST /v1/conversations` | 201 | 5 | `qa-4b234244-7e3a-4a9f-a31d-7eb806c75c74` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 28 | `qa-9e3d26b0-81d6-4614-a786-523948152470` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-c163429b-4d53-4544-8489-03fe2f17a325` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-f42a7798-03c6-42ff-8737-cd7291b4a782` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 33 | `qa-1520665c-0d45-461b-ae1f-04da70685902` |
| 9 | `GET /v1/credits/balance` | 200 | 10 | `qa-df0b8019-d8d4-402d-8ba1-1fd91ea10315` |
| 10 | `POST /v1/conversations` | 402 | 15 | `qa-89b84722-b5a1-4402-a004-560de07d188f` |
| 11 | `GET /v1/credits/ledger` | 200 | 47 | `qa-4bd918c3-53f5-474d-b671-9863e0aba93e` |
| 12 | `POST /v1/auth/token` | 200 | 15 | `qa-4c1163d2-bf37-44b0-8b31-6bf6402352ed` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-a01900ff-7f75-4de8-8fc1-b26a14c54f1b` |
| 14 | `POST /v1/auth/token` | 401 | 13 | `qa-b40ca7e2-1b6e-4866-90a2-bf41e6b92de1` |
| 15 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-eef9bd8a-4717-48fb-9781-ca57833f6468` |
| 16 | `POST /v1/auth/token` | 401 | 12 | `qa-05769594-74ab-4f95-abaf-af459ea3f4d0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-53af9216-52b9-47a9-b6ee-8be7dde9ee96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53af9216-52b9-47a9-b6ee-8be7dde9ee96
Content-Type: application/json

--- request body ---
{"handle":"qa-e16f36cc5f14","displayName":"QA e16f36cc5f14","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-53af9216-52b9-47a9-b6ee-8be7dde9ee96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Location: /v1/accounts/qa-e16f36cc5f14
X-Served-Region: eu
Content-Length: 181

{"id":"acc_731e76d1-1447-4c5d-a3a5-d3aaec4f1abf","handle":"qa-e16f36cc5f14","displayName":"QA e16f36cc5f14","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.901298425Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7c72998c-66d8-444c-b50f-604625f0a9c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c72998c-66d8-444c-b50f-604625f0a9c2
Content-Type: application/json

--- request body ---
{"handle":"qa-1ba8ef5b6f9e","displayName":"QA 1ba8ef5b6f9e","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c72998c-66d8-444c-b50f-604625f0a9c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Location: /v1/accounts/qa-1ba8ef5b6f9e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_960bf4a9-4242-491f-8fec-578d73baef83","handle":"qa-1ba8ef5b6f9e","displayName":"QA 1ba8ef5b6f9e","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.962087262Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-78c8a2d9-ebf5-4021-9843-13875b995248

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78c8a2d9-ebf5-4021-9843-13875b995248
Content-Type: application/json

--- request body ---
{"handle":"qa-e16f36cc5f14","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-78c8a2d9-ebf5-4021-9843-13875b995248
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_731e76d1-1447-4c5d-a3a5-d3aaec4f1abf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4b234244-7e3a-4a9f-a31d-7eb806c75c74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b234244-7e3a-4a9f-a31d-7eb806c75c74
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1ba8ef5b6f9e","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b234244-7e3a-4a9f-a31d-7eb806c75c74
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
Location: /v1/conversations/cnv_5e8eecb9-f3bd-4c0b-ac19-99e8faada78a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5e8eecb9-f3bd-4c0b-ac19-99e8faada78a","subject":"Error contract","status":"open","region":"eu","participants":["qa-e16f36cc5f14","qa-1ba8ef5b6f9e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:33.008111147Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5e8eecb9-f3bd-4c0b-ac19-99e8faada78a/messages
correlation: qa-9e3d26b0-81d6-4614-a786-523948152470

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e3d26b0-81d6-4614-a786-523948152470
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 28 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e3d26b0-81d6-4614-a786-523948152470
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

{"id":"msg_0ae2ade6-1ff2-4ab3-bfc0-33f4da2b4e80","conversationId":"cnv_5e8eecb9-f3bd-4c0b-ac19-99e8faada78a","sender":"qa-e16f36cc5f14","body":"2","createdAt":"2026-11-03T09:41:33.025130326Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_5e8eecb9-f3bd-4c0b-ac19-99e8faada78a/messages
correlation: qa-c163429b-4d53-4544-8489-03fe2f17a325

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c163429b-4d53-4544-8489-03fe2f17a325
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c163429b-4d53-4544-8489-03fe2f17a325
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

{"id":"msg_8a573a0d-01b5-486a-a033-f036644249d9","conversationId":"cnv_5e8eecb9-f3bd-4c0b-ac19-99e8faada78a","sender":"qa-e16f36cc5f14","body":"3","createdAt":"2026-11-03T09:41:33.062884391Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_5e8eecb9-f3bd-4c0b-ac19-99e8faada78a/messages
correlation: qa-f42a7798-03c6-42ff-8737-cd7291b4a782

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f42a7798-03c6-42ff-8737-cd7291b4a782
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f42a7798-03c6-42ff-8737-cd7291b4a782
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

{"id":"msg_920e2d3b-0cdc-46e3-8b35-31b3f281bc30","conversationId":"cnv_5e8eecb9-f3bd-4c0b-ac19-99e8faada78a","sender":"qa-e16f36cc5f14","body":"4","createdAt":"2026-11-03T09:41:33.100678147Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_5e8eecb9-f3bd-4c0b-ac19-99e8faada78a/messages
correlation: qa-1520665c-0d45-461b-ae1f-04da70685902

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1520665c-0d45-461b-ae1f-04da70685902
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 33 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1520665c-0d45-461b-ae1f-04da70685902
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

{"id":"msg_2fb08487-a56a-49af-99da-9d1ed1913426","conversationId":"cnv_5e8eecb9-f3bd-4c0b-ac19-99e8faada78a","sender":"qa-e16f36cc5f14","body":"5","createdAt":"2026-11-03T09:41:33.146101546Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-df0b8019-d8d4-402d-8ba1-1fd91ea10315

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df0b8019-d8d4-402d-8ba1-1fd91ea10315
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-df0b8019-d8d4-402d-8ba1-1fd91ea10315
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

{"balance":0,"currency":"credits","accountId":"acc_731e76d1-1447-4c5d-a3a5-d3aaec4f1abf"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-89b84722-b5a1-4402-a004-560de07d188f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89b84722-b5a1-4402-a004-560de07d188f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1ba8ef5b6f9e","subject":"One more","message":"Hi"}

--- response: 402 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-89b84722-b5a1-4402-a004-560de07d188f
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-89b84722-b5a1-4402-a004-560de07d188f"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-4bd918c3-53f5-474d-b671-9863e0aba93e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bd918c3-53f5-474d-b671-9863e0aba93e
Content-Type: application/json

--- response: 200 in 47 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bd918c3-53f5-474d-b671-9863e0aba93e
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

{"items":[{"id":"led_126ad58b-837c-4cb9-8467-df69f24ff7eb","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-03T09:41:32.901304915Z"},{"id":"led_df5a7cf7-8581-4401-9339-b4c13dce8d9b","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_5e8eecb9-f3bd-4c0b-ac19-99e8faada78a","createdAt":"2026-11-03T09:41:33.008101963Z"},{"id":"led_429252a9-089d-4b19-9950-127a1630de49","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_0ae2ade6-1ff2-4ab3-bfc0-33f4da2b4e80","createdAt":"2026-11-03T09:41:33.025108543Z"},{"id":"led_591f8c64-2eaf-4d93-ada6-9f3e40ef92fa","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_8a573a0d-01b5-486a-a033-f036644249d9","createdAt":"2026-11-03T09:41:33.062875448Z"},{"id":"led_95576749-3f6d-47bf-bad4-4fcac993b1d8","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_920e2d3b-0cdc-46e3-8b35-31b3f281bc30","createdAt":"2026-11-03T09:41:33.100668833Z"},{"id":"led_746539f3-72f5-40dc-86a1-671add0d9171","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_2fb08487-a56a-49af-99da-9d1ed1913426","createdAt":"2026-11-03T09:41:33.146091912Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-4c1163d2-bf37-44b0-8b31-6bf6402352ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c1163d2-bf37-44b0-8b31-6bf6402352ed
Content-Type: application/json

--- request body ---
{"handle":"qa-1ba8ef5b6f9e","password":"****"}

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c1163d2-bf37-44b0-8b31-6bf6402352ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_960bf4a9-4242-491f-8fec-578d73baef83"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a01900ff-7f75-4de8-8fc1-b26a14c54f1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a01900ff-7f75-4de8-8fc1-b26a14c54f1b
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a01900ff-7f75-4de8-8fc1-b26a14c54f1b
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
correlation: qa-b40ca7e2-1b6e-4866-90a2-bf41e6b92de1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b40ca7e2-1b6e-4866-90a2-bf41e6b92de1
Content-Type: application/json

--- request body ---
{"handle":"qa-1ba8ef5b6f9e","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b40ca7e2-1b6e-4866-90a2-bf41e6b92de1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b40ca7e2-1b6e-4866-90a2-bf41e6b92de1"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eef9bd8a-4717-48fb-9781-ca57833f6468

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eef9bd8a-4717-48fb-9781-ca57833f6468
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eef9bd8a-4717-48fb-9781-ca57833f6468
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
correlation: qa-05769594-74ab-4f95-abaf-af459ea3f4d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05769594-74ab-4f95-abaf-af459ea3f4d0
Content-Type: application/json

--- request body ---
{"handle":"qa-e16f36cc5f14","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05769594-74ab-4f95-abaf-af459ea3f4d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-05769594-74ab-4f95-abaf-af459ea3f4d0"}
```
