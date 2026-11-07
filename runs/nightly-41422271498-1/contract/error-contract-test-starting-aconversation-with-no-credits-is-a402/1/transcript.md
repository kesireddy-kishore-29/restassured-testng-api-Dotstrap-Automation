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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-6a5189bd-cbc8-4fdd-8baf-ff40d33da908` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-ebbc4570-6c1a-45fc-bbd3-3467fdfb497e` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-24997f24-7f63-4859-b18b-27c6e44e1ed3` |
| 4 | `POST /v1/conversations` | 201 | 4 | `qa-ffbacf81-b20e-4965-8791-9c31d47476ac` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-d396909e-4837-43ed-a2a1-5c2aa81b8905` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-74254da5-bf4d-43fa-ace8-036e2d9ef943` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-c8b4fd0d-3fc8-44a0-9948-06ce1b01eba0` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 18 | `qa-48d92b94-0799-4ecd-9233-c3c79d791321` |
| 9 | `GET /v1/credits/balance` | 200 | 20 | `qa-af1d2a61-08a4-45e8-a552-535e327dbe81` |
| 10 | `POST /v1/conversations` | 402 | 11 | `qa-2d31a325-0735-45e0-9bba-2f5632496837` |
| 11 | `GET /v1/credits/ledger` | 200 | 25 | `qa-4fa5f1b2-3b5b-4799-ad0e-81a0f6825742` |
| 12 | `POST /v1/auth/token` | 200 | 20 | `qa-d01993ca-f1a6-4f29-b70d-0efa94117684` |
| 13 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-e90accaa-33ad-4c6d-8701-d98ae0587ca6` |
| 14 | `POST /v1/auth/token` | 401 | 7 | `qa-e42360f6-e62a-4957-8300-40d4c204a676` |
| 15 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-6206db52-2a40-4554-b98c-81d8d47d7025` |
| 16 | `POST /v1/auth/token` | 401 | 7 | `qa-f1f56a22-bc2f-441c-8ff9-2453a4e09334` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6a5189bd-cbc8-4fdd-8baf-ff40d33da908

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a5189bd-cbc8-4fdd-8baf-ff40d33da908
Content-Type: application/json

--- request body ---
{"handle":"qa-f27bf760a918","displayName":"QA f27bf760a918","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a5189bd-cbc8-4fdd-8baf-ff40d33da908
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Location: /v1/accounts/qa-f27bf760a918
X-Served-Region: eu
Content-Length: 181

{"id":"acc_77eb1544-e92c-400a-be12-1321cd6fd5cd","handle":"qa-f27bf760a918","displayName":"QA f27bf760a918","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.927836895Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ebbc4570-6c1a-45fc-bbd3-3467fdfb497e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebbc4570-6c1a-45fc-bbd3-3467fdfb497e
Content-Type: application/json

--- request body ---
{"handle":"qa-20a9073150c2","displayName":"QA 20a9073150c2","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebbc4570-6c1a-45fc-bbd3-3467fdfb497e
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
Location: /v1/accounts/qa-20a9073150c2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_52b27585-687f-457b-becf-af5f572e73ca","handle":"qa-20a9073150c2","displayName":"QA 20a9073150c2","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.970860218Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-24997f24-7f63-4859-b18b-27c6e44e1ed3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24997f24-7f63-4859-b18b-27c6e44e1ed3
Content-Type: application/json

--- request body ---
{"handle":"qa-f27bf760a918","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-24997f24-7f63-4859-b18b-27c6e44e1ed3
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_77eb1544-e92c-400a-be12-1321cd6fd5cd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ffbacf81-b20e-4965-8791-9c31d47476ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffbacf81-b20e-4965-8791-9c31d47476ac
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-20a9073150c2","subject":"Error contract","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffbacf81-b20e-4965-8791-9c31d47476ac
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
Location: /v1/conversations/cnv_3cf4b230-f289-45ef-a21c-5409fb377de3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3cf4b230-f289-45ef-a21c-5409fb377de3","subject":"Error contract","status":"open","region":"eu","participants":["qa-f27bf760a918","qa-20a9073150c2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:37.015487381Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_3cf4b230-f289-45ef-a21c-5409fb377de3/messages
correlation: qa-d396909e-4837-43ed-a2a1-5c2aa81b8905

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d396909e-4837-43ed-a2a1-5c2aa81b8905
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d396909e-4837-43ed-a2a1-5c2aa81b8905
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

{"id":"msg_3d8cd4b5-bfdc-4948-88ab-e080cbcf8656","conversationId":"cnv_3cf4b230-f289-45ef-a21c-5409fb377de3","sender":"qa-f27bf760a918","body":"2","createdAt":"2026-11-02T09:38:37.036689468Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_3cf4b230-f289-45ef-a21c-5409fb377de3/messages
correlation: qa-74254da5-bf4d-43fa-ace8-036e2d9ef943

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74254da5-bf4d-43fa-ace8-036e2d9ef943
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-74254da5-bf4d-43fa-ace8-036e2d9ef943
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

{"id":"msg_de4a8c5b-4892-4bfa-a85a-5d64f0634d75","conversationId":"cnv_3cf4b230-f289-45ef-a21c-5409fb377de3","sender":"qa-f27bf760a918","body":"3","createdAt":"2026-11-02T09:38:37.084697999Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_3cf4b230-f289-45ef-a21c-5409fb377de3/messages
correlation: qa-c8b4fd0d-3fc8-44a0-9948-06ce1b01eba0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8b4fd0d-3fc8-44a0-9948-06ce1b01eba0
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8b4fd0d-3fc8-44a0-9948-06ce1b01eba0
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

{"id":"msg_6e119593-e3a2-49ae-a6f7-c362f770a822","conversationId":"cnv_3cf4b230-f289-45ef-a21c-5409fb377de3","sender":"qa-f27bf760a918","body":"4","createdAt":"2026-11-02T09:38:37.118879215Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_3cf4b230-f289-45ef-a21c-5409fb377de3/messages
correlation: qa-48d92b94-0799-4ecd-9233-c3c79d791321

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48d92b94-0799-4ecd-9233-c3c79d791321
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-48d92b94-0799-4ecd-9233-c3c79d791321
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

{"id":"msg_34296056-8407-4dc7-80d6-6533bf089fde","conversationId":"cnv_3cf4b230-f289-45ef-a21c-5409fb377de3","sender":"qa-f27bf760a918","body":"5","createdAt":"2026-11-02T09:38:37.150211307Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-af1d2a61-08a4-45e8-a552-535e327dbe81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af1d2a61-08a4-45e8-a552-535e327dbe81
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-af1d2a61-08a4-45e8-a552-535e327dbe81
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

{"balance":0,"currency":"credits","accountId":"acc_77eb1544-e92c-400a-be12-1321cd6fd5cd"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-2d31a325-0735-45e0-9bba-2f5632496837

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d31a325-0735-45e0-9bba-2f5632496837
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-20a9073150c2","subject":"One more","message":"Hi"}

--- response: 402 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d31a325-0735-45e0-9bba-2f5632496837
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-2d31a325-0735-45e0-9bba-2f5632496837"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-4fa5f1b2-3b5b-4799-ad0e-81a0f6825742

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fa5f1b2-3b5b-4799-ad0e-81a0f6825742
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fa5f1b2-3b5b-4799-ad0e-81a0f6825742
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
Content-Length: 1166

{"items":[{"id":"led_9467e672-a35f-4070-b56e-804098f0d94c","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-02T09:38:36.927844146Z"},{"id":"led_8e4b36f1-8872-4d97-9857-a9dbf45477c0","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_3cf4b230-f289-45ef-a21c-5409fb377de3","createdAt":"2026-11-02T09:38:37.015441032Z"},{"id":"led_d6070349-da60-4e11-9db8-4379bd94d8b7","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_3d8cd4b5-bfdc-4948-88ab-e080cbcf8656","createdAt":"2026-11-02T09:38:37.036673704Z"},{"id":"led_152812b8-1eee-4bba-b09d-0d306194d972","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_de4a8c5b-4892-4bfa-a85a-5d64f0634d75","createdAt":"2026-11-02T09:38:37.084686843Z"},{"id":"led_71bd9777-be31-4a44-adb5-69ccc9ed9387","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_6e119593-e3a2-49ae-a6f7-c362f770a822","createdAt":"2026-11-02T09:38:37.118869Z"},{"id":"led_d481c08d-d9c4-4d70-be9d-9ccaac5c38d2","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_34296056-8407-4dc7-80d6-6533bf089fde","createdAt":"2026-11-02T09:38:37.150191397Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-d01993ca-f1a6-4f29-b70d-0efa94117684

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d01993ca-f1a6-4f29-b70d-0efa94117684
Content-Type: application/json

--- request body ---
{"handle":"qa-20a9073150c2","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d01993ca-f1a6-4f29-b70d-0efa94117684
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_52b27585-687f-457b-becf-af5f572e73ca"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e90accaa-33ad-4c6d-8701-d98ae0587ca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e90accaa-33ad-4c6d-8701-d98ae0587ca6
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e90accaa-33ad-4c6d-8701-d98ae0587ca6
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
correlation: qa-e42360f6-e62a-4957-8300-40d4c204a676

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e42360f6-e62a-4957-8300-40d4c204a676
Content-Type: application/json

--- request body ---
{"handle":"qa-20a9073150c2","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e42360f6-e62a-4957-8300-40d4c204a676
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e42360f6-e62a-4957-8300-40d4c204a676"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6206db52-2a40-4554-b98c-81d8d47d7025

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6206db52-2a40-4554-b98c-81d8d47d7025
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6206db52-2a40-4554-b98c-81d8d47d7025
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
correlation: qa-f1f56a22-bc2f-441c-8ff9-2453a4e09334

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1f56a22-bc2f-441c-8ff9-2453a4e09334
Content-Type: application/json

--- request body ---
{"handle":"qa-f27bf760a918","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1f56a22-bc2f-441c-8ff9-2453a4e09334
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f1f56a22-bc2f-441c-8ff9-2453a4e09334"}
```
