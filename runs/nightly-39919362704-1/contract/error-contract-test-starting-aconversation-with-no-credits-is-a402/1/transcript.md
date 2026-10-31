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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-f09ae252-9d74-4df9-99c4-0813ed798d77` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-754c440d-d485-4cb2-8876-5bf8debac7bd` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-d705b790-442f-4f80-92c6-68e926a510cc` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-8c0fbd41-e889-4ef4-99a9-049e3bd11393` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-9ee92984-e3e9-472d-9740-bea88e892baa` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-ac318e78-15ff-458f-a687-dcde99fbc3be` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 18 | `qa-aa321629-6aa2-4970-9975-03a7ab92d30b` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 25 | `qa-a19c889f-9acd-45be-a43c-9bd1f6c0dfaf` |
| 9 | `GET /v1/credits/balance` | 200 | 31 | `qa-540c6178-0161-423b-abd6-eb2b7610274c` |
| 10 | `POST /v1/conversations` | 402 | 6 | `qa-a79a150b-aa1e-4986-9109-f8c08f61c5c7` |
| 11 | `GET /v1/credits/ledger` | 200 | 15 | `qa-982c2627-a7d9-4952-995f-b19a1a8f80d8` |
| 12 | `POST /v1/auth/token` | 200 | 13 | `qa-5ee550bf-b551-429e-b4b8-5d62fea101b2` |
| 13 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-af1ebef4-d44b-4c46-9434-271ff20ca7e3` |
| 14 | `POST /v1/auth/token` | 401 | 14 | `qa-3d220026-bd59-4518-a58a-b4c0642278a3` |
| 15 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-227abc48-7f74-469a-8eb2-435b0a0c60ba` |
| 16 | `POST /v1/auth/token` | 401 | 9 | `qa-023173ff-e8c0-499d-8220-f98960bdcc5b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f09ae252-9d74-4df9-99c4-0813ed798d77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f09ae252-9d74-4df9-99c4-0813ed798d77
Content-Type: application/json

--- request body ---
{"handle":"qa-1598af735ad9","displayName":"QA 1598af735ad9","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-f09ae252-9d74-4df9-99c4-0813ed798d77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 7
Location: /v1/accounts/qa-1598af735ad9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_82edd1e4-704f-40c3-b5ef-464b7c2ca71c","handle":"qa-1598af735ad9","displayName":"QA 1598af735ad9","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.362409152Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-754c440d-d485-4cb2-8876-5bf8debac7bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-754c440d-d485-4cb2-8876-5bf8debac7bd
Content-Type: application/json

--- request body ---
{"handle":"qa-aa3908e264f2","displayName":"QA aa3908e264f2","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-754c440d-d485-4cb2-8876-5bf8debac7bd
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
Location: /v1/accounts/qa-aa3908e264f2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e8ab2916-1eec-41e2-8d06-625a33f06b71","handle":"qa-aa3908e264f2","displayName":"QA aa3908e264f2","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.414377528Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d705b790-442f-4f80-92c6-68e926a510cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d705b790-442f-4f80-92c6-68e926a510cc
Content-Type: application/json

--- request body ---
{"handle":"qa-1598af735ad9","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d705b790-442f-4f80-92c6-68e926a510cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_82edd1e4-704f-40c3-b5ef-464b7c2ca71c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8c0fbd41-e889-4ef4-99a9-049e3bd11393

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c0fbd41-e889-4ef4-99a9-049e3bd11393
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-aa3908e264f2","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c0fbd41-e889-4ef4-99a9-049e3bd11393
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
Location: /v1/conversations/cnv_31bdc6ac-d277-498a-9fe1-837c292e0f04
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_31bdc6ac-d277-498a-9fe1-837c292e0f04","subject":"Error contract","status":"open","region":"eu","participants":["qa-1598af735ad9","qa-aa3908e264f2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.502377994Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_31bdc6ac-d277-498a-9fe1-837c292e0f04/messages
correlation: qa-9ee92984-e3e9-472d-9740-bea88e892baa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ee92984-e3e9-472d-9740-bea88e892baa
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ee92984-e3e9-472d-9740-bea88e892baa
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

{"id":"msg_b3ff364c-3ca9-4179-b68f-0c71429e363a","conversationId":"cnv_31bdc6ac-d277-498a-9fe1-837c292e0f04","sender":"qa-1598af735ad9","body":"2","createdAt":"2026-10-23T07:41:46.548591780Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_31bdc6ac-d277-498a-9fe1-837c292e0f04/messages
correlation: qa-ac318e78-15ff-458f-a687-dcde99fbc3be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac318e78-15ff-458f-a687-dcde99fbc3be
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac318e78-15ff-458f-a687-dcde99fbc3be
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

{"id":"msg_ed7e5ef4-31e9-4e8e-b2b3-3ab56adf4970","conversationId":"cnv_31bdc6ac-d277-498a-9fe1-837c292e0f04","sender":"qa-1598af735ad9","body":"3","createdAt":"2026-10-23T07:41:46.573860459Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_31bdc6ac-d277-498a-9fe1-837c292e0f04/messages
correlation: qa-aa321629-6aa2-4970-9975-03a7ab92d30b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa321629-6aa2-4970-9975-03a7ab92d30b
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa321629-6aa2-4970-9975-03a7ab92d30b
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

{"id":"msg_b8309b41-a426-4919-997a-56f7626d0614","conversationId":"cnv_31bdc6ac-d277-498a-9fe1-837c292e0f04","sender":"qa-1598af735ad9","body":"4","createdAt":"2026-10-23T07:41:46.606284825Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_31bdc6ac-d277-498a-9fe1-837c292e0f04/messages
correlation: qa-a19c889f-9acd-45be-a43c-9bd1f6c0dfaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a19c889f-9acd-45be-a43c-9bd1f6c0dfaf
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-a19c889f-9acd-45be-a43c-9bd1f6c0dfaf
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

{"id":"msg_5a89038b-f981-42e3-a7d9-e55766b26d30","conversationId":"cnv_31bdc6ac-d277-498a-9fe1-837c292e0f04","sender":"qa-1598af735ad9","body":"5","createdAt":"2026-10-23T07:41:46.641308047Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-540c6178-0161-423b-abd6-eb2b7610274c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-540c6178-0161-423b-abd6-eb2b7610274c
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-540c6178-0161-423b-abd6-eb2b7610274c
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

{"balance":0,"currency":"credits","accountId":"acc_82edd1e4-704f-40c3-b5ef-464b7c2ca71c"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-a79a150b-aa1e-4986-9109-f8c08f61c5c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a79a150b-aa1e-4986-9109-f8c08f61c5c7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-aa3908e264f2","subject":"One more","message":"Hi"}

--- response: 402 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a79a150b-aa1e-4986-9109-f8c08f61c5c7
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-a79a150b-aa1e-4986-9109-f8c08f61c5c7"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-982c2627-a7d9-4952-995f-b19a1a8f80d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-982c2627-a7d9-4952-995f-b19a1a8f80d8
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-982c2627-a7d9-4952-995f-b19a1a8f80d8
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

{"items":[{"id":"led_66b229cd-7b51-4a28-8735-2c3205604f34","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-23T07:41:46.362418559Z"},{"id":"led_7b08db4a-08b1-4cd4-aa80-7625d1912585","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_31bdc6ac-d277-498a-9fe1-837c292e0f04","createdAt":"2026-10-23T07:41:46.502362755Z"},{"id":"led_f9a85aac-2978-46c0-9e86-f2f0ede51d0c","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_b3ff364c-3ca9-4179-b68f-0c71429e363a","createdAt":"2026-10-23T07:41:46.548584376Z"},{"id":"led_a421ae43-4aa5-45d5-abca-166cb5dfc114","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_ed7e5ef4-31e9-4e8e-b2b3-3ab56adf4970","createdAt":"2026-10-23T07:41:46.573851542Z"},{"id":"led_489e3938-d8ce-4f02-97f4-ae23c4e06777","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_b8309b41-a426-4919-997a-56f7626d0614","createdAt":"2026-10-23T07:41:46.606265288Z"},{"id":"led_b15b4d8d-b1d1-4b0f-9ca2-141de22740e8","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_5a89038b-f981-42e3-a7d9-e55766b26d30","createdAt":"2026-10-23T07:41:46.641296686Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-5ee550bf-b551-429e-b4b8-5d62fea101b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ee550bf-b551-429e-b4b8-5d62fea101b2
Content-Type: application/json

--- request body ---
{"handle":"qa-aa3908e264f2","password":"****"}

--- response: 200 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ee550bf-b551-429e-b4b8-5d62fea101b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e8ab2916-1eec-41e2-8d06-625a33f06b71"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-af1ebef4-d44b-4c46-9434-271ff20ca7e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af1ebef4-d44b-4c46-9434-271ff20ca7e3
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-af1ebef4-d44b-4c46-9434-271ff20ca7e3
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
correlation: qa-3d220026-bd59-4518-a58a-b4c0642278a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d220026-bd59-4518-a58a-b4c0642278a3
Content-Type: application/json

--- request body ---
{"handle":"qa-aa3908e264f2","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d220026-bd59-4518-a58a-b4c0642278a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d220026-bd59-4518-a58a-b4c0642278a3"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-227abc48-7f74-469a-8eb2-435b0a0c60ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-227abc48-7f74-469a-8eb2-435b0a0c60ba
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-227abc48-7f74-469a-8eb2-435b0a0c60ba
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
correlation: qa-023173ff-e8c0-499d-8220-f98960bdcc5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-023173ff-e8c0-499d-8220-f98960bdcc5b
Content-Type: application/json

--- request body ---
{"handle":"qa-1598af735ad9","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-023173ff-e8c0-499d-8220-f98960bdcc5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-023173ff-e8c0-499d-8220-f98960bdcc5b"}
```
