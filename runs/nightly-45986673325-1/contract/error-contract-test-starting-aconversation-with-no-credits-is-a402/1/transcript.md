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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-f4c7c744-5d17-437f-a8ec-91da25c5eb51` |
| 2 | `POST /v1/accounts` | 201 | 58 | `qa-41d8a83d-a341-413a-8a97-3ba2166b500f` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-d980f8e3-e593-4337-b1c2-d951fb24649a` |
| 4 | `POST /v1/conversations` | 201 | 37 | `qa-5cf44afe-f9d6-4aac-ba9e-f0efaa39caab` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-315fa718-3657-41bf-b6a4-c0b0c5248daf` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-1b3aca3d-a58c-48a3-9d5f-39033e8e7a93` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 8 | `qa-21b292fd-78a5-467f-9df0-683f776b91e8` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 41 | `qa-6baaabc8-596f-402d-9b09-d21ae7fadfc2` |
| 9 | `GET /v1/credits/balance` | 200 | 9 | `qa-8e09b630-89d2-43c9-9cd5-d304228d476e` |
| 10 | `POST /v1/conversations` | 402 | 5 | `qa-ccf4ed81-6f67-46b1-b7cc-119154514820` |
| 11 | `GET /v1/credits/ledger` | 200 | 18 | `qa-bc64d52e-3421-4048-a483-12cd520b584e` |
| 12 | `POST /v1/auth/token` | 200 | 18 | `qa-e1a862f7-9623-495c-a078-405c3a4934b4` |
| 13 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-d707ac65-2583-45fd-b57f-b080142668d5` |
| 14 | `POST /v1/auth/token` | 401 | 7 | `qa-11e523f8-63d1-48b4-9b80-505a2c46b99e` |
| 15 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-dd0a2693-9724-4b2f-98e2-5b109fe98285` |
| 16 | `POST /v1/auth/token` | 401 | 6 | `qa-12b73095-500a-479e-b358-412d137979b5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f4c7c744-5d17-437f-a8ec-91da25c5eb51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4c7c744-5d17-437f-a8ec-91da25c5eb51
Content-Type: application/json

--- request body ---
{"handle":"qa-505c0e6078ba","displayName":"QA 505c0e6078ba","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4c7c744-5d17-437f-a8ec-91da25c5eb51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Location: /v1/accounts/qa-505c0e6078ba
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc8b1ae7-8ae0-489e-ba5a-fa8fad72df9c","handle":"qa-505c0e6078ba","displayName":"QA 505c0e6078ba","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.528046800Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-41d8a83d-a341-413a-8a97-3ba2166b500f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41d8a83d-a341-413a-8a97-3ba2166b500f
Content-Type: application/json

--- request body ---
{"handle":"qa-12210364e128","displayName":"QA 12210364e128","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-41d8a83d-a341-413a-8a97-3ba2166b500f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 7
Location: /v1/accounts/qa-12210364e128
X-Served-Region: eu
Content-Length: 181

{"id":"acc_868b0701-da30-45a3-96f3-4a29b46fe13d","handle":"qa-12210364e128","displayName":"QA 12210364e128","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.608775769Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d980f8e3-e593-4337-b1c2-d951fb24649a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d980f8e3-e593-4337-b1c2-d951fb24649a
Content-Type: application/json

--- request body ---
{"handle":"qa-505c0e6078ba","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d980f8e3-e593-4337-b1c2-d951fb24649a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc8b1ae7-8ae0-489e-ba5a-fa8fad72df9c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5cf44afe-f9d6-4aac-ba9e-f0efaa39caab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cf44afe-f9d6-4aac-ba9e-f0efaa39caab
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-12210364e128","subject":"Error contract","message":"Hi"}

--- response: 201 in 37 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cf44afe-f9d6-4aac-ba9e-f0efaa39caab
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
Location: /v1/conversations/cnv_627b1758-03e9-4079-b5fc-4449b072a445
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_627b1758-03e9-4079-b5fc-4449b072a445","subject":"Error contract","status":"open","region":"eu","participants":["qa-505c0e6078ba","qa-12210364e128"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.710665460Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_627b1758-03e9-4079-b5fc-4449b072a445/messages
correlation: qa-315fa718-3657-41bf-b6a4-c0b0c5248daf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-315fa718-3657-41bf-b6a4-c0b0c5248daf
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-315fa718-3657-41bf-b6a4-c0b0c5248daf
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

{"id":"msg_ff032555-3033-440d-9478-cd25815f7d07","conversationId":"cnv_627b1758-03e9-4079-b5fc-4449b072a445","sender":"qa-505c0e6078ba","body":"2","createdAt":"2026-11-27T10:59:59.748209669Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_627b1758-03e9-4079-b5fc-4449b072a445/messages
correlation: qa-1b3aca3d-a58c-48a3-9d5f-39033e8e7a93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b3aca3d-a58c-48a3-9d5f-39033e8e7a93
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b3aca3d-a58c-48a3-9d5f-39033e8e7a93
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

{"id":"msg_3370099d-ea70-45be-a1d9-45874a28dddd","conversationId":"cnv_627b1758-03e9-4079-b5fc-4449b072a445","sender":"qa-505c0e6078ba","body":"3","createdAt":"2026-11-27T10:59:59.785741910Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_627b1758-03e9-4079-b5fc-4449b072a445/messages
correlation: qa-21b292fd-78a5-467f-9df0-683f776b91e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21b292fd-78a5-467f-9df0-683f776b91e8
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-21b292fd-78a5-467f-9df0-683f776b91e8
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

{"id":"msg_b9cb6f81-7000-434c-aeef-097f19b99edd","conversationId":"cnv_627b1758-03e9-4079-b5fc-4449b072a445","sender":"qa-505c0e6078ba","body":"4","createdAt":"2026-11-27T10:59:59.808419999Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_627b1758-03e9-4079-b5fc-4449b072a445/messages
correlation: qa-6baaabc8-596f-402d-9b09-d21ae7fadfc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6baaabc8-596f-402d-9b09-d21ae7fadfc2
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 41 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6baaabc8-596f-402d-9b09-d21ae7fadfc2
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

{"id":"msg_59e3a663-6ad1-4551-a18a-aed3f7fd8596","conversationId":"cnv_627b1758-03e9-4079-b5fc-4449b072a445","sender":"qa-505c0e6078ba","body":"5","createdAt":"2026-11-27T10:59:59.854568955Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-8e09b630-89d2-43c9-9cd5-d304228d476e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e09b630-89d2-43c9-9cd5-d304228d476e
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e09b630-89d2-43c9-9cd5-d304228d476e
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

{"balance":0,"currency":"credits","accountId":"acc_cc8b1ae7-8ae0-489e-ba5a-fa8fad72df9c"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-ccf4ed81-6f67-46b1-b7cc-119154514820

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccf4ed81-6f67-46b1-b7cc-119154514820
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-12210364e128","subject":"One more","message":"Hi"}

--- response: 402 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ccf4ed81-6f67-46b1-b7cc-119154514820
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-ccf4ed81-6f67-46b1-b7cc-119154514820"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-bc64d52e-3421-4048-a483-12cd520b584e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc64d52e-3421-4048-a483-12cd520b584e
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc64d52e-3421-4048-a483-12cd520b584e
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

{"items":[{"id":"led_5238a49f-ed3c-4cb8-8875-58793249af4e","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-27T10:59:59.528062304Z"},{"id":"led_b724d416-f4a0-4dae-a0ab-9590ca69032c","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_627b1758-03e9-4079-b5fc-4449b072a445","createdAt":"2026-11-27T10:59:59.710654123Z"},{"id":"led_e1a56050-969f-4d81-b5bc-50ab8969d5a9","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_ff032555-3033-440d-9478-cd25815f7d07","createdAt":"2026-11-27T10:59:59.748197050Z"},{"id":"led_c51f2a83-44ab-49a0-8e0b-eda0e8f8acfc","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_3370099d-ea70-45be-a1d9-45874a28dddd","createdAt":"2026-11-27T10:59:59.785734398Z"},{"id":"led_3fdba81e-0d46-40a2-aac0-c21d0b7c9fa8","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_b9cb6f81-7000-434c-aeef-097f19b99edd","createdAt":"2026-11-27T10:59:59.808414200Z"},{"id":"led_3f56e334-8636-4b62-b99a-c73480d37aaf","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_59e3a663-6ad1-4551-a18a-aed3f7fd8596","createdAt":"2026-11-27T10:59:59.854558990Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-e1a862f7-9623-495c-a078-405c3a4934b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1a862f7-9623-495c-a078-405c3a4934b4
Content-Type: application/json

--- request body ---
{"handle":"qa-12210364e128","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1a862f7-9623-495c-a078-405c3a4934b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_868b0701-da30-45a3-96f3-4a29b46fe13d"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d707ac65-2583-45fd-b57f-b080142668d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d707ac65-2583-45fd-b57f-b080142668d5
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d707ac65-2583-45fd-b57f-b080142668d5
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
correlation: qa-11e523f8-63d1-48b4-9b80-505a2c46b99e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11e523f8-63d1-48b4-9b80-505a2c46b99e
Content-Type: application/json

--- request body ---
{"handle":"qa-12210364e128","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11e523f8-63d1-48b4-9b80-505a2c46b99e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-11e523f8-63d1-48b4-9b80-505a2c46b99e"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dd0a2693-9724-4b2f-98e2-5b109fe98285

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd0a2693-9724-4b2f-98e2-5b109fe98285
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dd0a2693-9724-4b2f-98e2-5b109fe98285
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
correlation: qa-12b73095-500a-479e-b358-412d137979b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12b73095-500a-479e-b358-412d137979b5
Content-Type: application/json

--- request body ---
{"handle":"qa-505c0e6078ba","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12b73095-500a-479e-b358-412d137979b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12b73095-500a-479e-b358-412d137979b5"}
```
