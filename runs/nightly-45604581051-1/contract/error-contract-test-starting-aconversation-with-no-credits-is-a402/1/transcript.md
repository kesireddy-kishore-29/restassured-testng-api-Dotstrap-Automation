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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-22cca3fa-434a-426b-a1a1-c2a3e06ae871` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-9aecf820-6b5f-43aa-9050-30741055c174` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-6686c4db-7f3f-4634-9bee-f1f8ecb2db08` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-034a1c54-5125-4ad5-8755-f00e0e8ea318` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-79a54445-d055-44e2-9275-37564aebe1c0` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 29 | `qa-a4ba0086-e9b6-4e15-98fd-6abc48442d91` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 52 | `qa-111f64b9-3fa5-420e-ba01-66ad1531eb93` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-2493c749-7dbd-4fc8-8f75-8be677e5a451` |
| 9 | `GET /v1/credits/balance` | 200 | 15 | `qa-46152438-0556-4ad1-a1cf-20c5c8d136d7` |
| 10 | `POST /v1/conversations` | 402 | 4 | `qa-2fd33830-f0a1-4fff-8270-e7d123b8fbd8` |
| 11 | `GET /v1/credits/ledger` | 200 | 9 | `qa-02286110-766e-4ec9-ba38-7b918052b8dd` |
| 12 | `POST /v1/auth/token` | 200 | 13 | `qa-2cb1ef60-d501-4348-b0d2-8604feb894e7` |
| 13 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-b3308b3b-78b7-43b3-a1d0-8200f3c8206e` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-7d6c033d-8879-4f9b-8ca6-f5b8e0764fa1` |
| 15 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-9eb978d8-28f7-4ba6-b114-98905e758ce8` |
| 16 | `POST /v1/auth/token` | 401 | 12 | `qa-bcd2c90a-a934-4d3e-b4bb-e071f2eab3a8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-22cca3fa-434a-426b-a1a1-c2a3e06ae871

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22cca3fa-434a-426b-a1a1-c2a3e06ae871
Content-Type: application/json

--- request body ---
{"handle":"qa-d2b694b50248","displayName":"QA d2b694b50248","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-22cca3fa-434a-426b-a1a1-c2a3e06ae871
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Location: /v1/accounts/qa-d2b694b50248
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e23274db-45e7-4177-b62f-f0740441e971","handle":"qa-d2b694b50248","displayName":"QA d2b694b50248","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.069993008Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9aecf820-6b5f-43aa-9050-30741055c174

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9aecf820-6b5f-43aa-9050-30741055c174
Content-Type: application/json

--- request body ---
{"handle":"qa-3f090567ee3c","displayName":"QA 3f090567ee3c","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9aecf820-6b5f-43aa-9050-30741055c174
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 8
Location: /v1/accounts/qa-3f090567ee3c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7ac32403-0780-4428-9df2-3f9f530865fd","handle":"qa-3f090567ee3c","displayName":"QA 3f090567ee3c","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.125611141Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6686c4db-7f3f-4634-9bee-f1f8ecb2db08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6686c4db-7f3f-4634-9bee-f1f8ecb2db08
Content-Type: application/json

--- request body ---
{"handle":"qa-d2b694b50248","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6686c4db-7f3f-4634-9bee-f1f8ecb2db08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e23274db-45e7-4177-b62f-f0740441e971"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-034a1c54-5125-4ad5-8755-f00e0e8ea318

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-034a1c54-5125-4ad5-8755-f00e0e8ea318
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3f090567ee3c","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-034a1c54-5125-4ad5-8755-f00e0e8ea318
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
Location: /v1/conversations/cnv_5511d6b3-e8e5-4ab6-864c-162b929bbce2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5511d6b3-e8e5-4ab6-864c-162b929bbce2","subject":"Error contract","status":"open","region":"eu","participants":["qa-d2b694b50248","qa-3f090567ee3c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.184232666Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5511d6b3-e8e5-4ab6-864c-162b929bbce2/messages
correlation: qa-79a54445-d055-44e2-9275-37564aebe1c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79a54445-d055-44e2-9275-37564aebe1c0
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-79a54445-d055-44e2-9275-37564aebe1c0
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

{"id":"msg_88cc44e8-3b11-42c4-a830-baca01d6f698","conversationId":"cnv_5511d6b3-e8e5-4ab6-864c-162b929bbce2","sender":"qa-d2b694b50248","body":"2","createdAt":"2026-11-25T11:27:59.209255939Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_5511d6b3-e8e5-4ab6-864c-162b929bbce2/messages
correlation: qa-a4ba0086-e9b6-4e15-98fd-6abc48442d91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4ba0086-e9b6-4e15-98fd-6abc48442d91
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 29 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4ba0086-e9b6-4e15-98fd-6abc48442d91
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

{"id":"msg_34e0acf3-352d-483c-8b83-e6b1d82d451a","conversationId":"cnv_5511d6b3-e8e5-4ab6-864c-162b929bbce2","sender":"qa-d2b694b50248","body":"3","createdAt":"2026-11-25T11:27:59.250052671Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_5511d6b3-e8e5-4ab6-864c-162b929bbce2/messages
correlation: qa-111f64b9-3fa5-420e-ba01-66ad1531eb93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-111f64b9-3fa5-420e-ba01-66ad1531eb93
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 52 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-111f64b9-3fa5-420e-ba01-66ad1531eb93
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

{"id":"msg_68ea06e3-204c-4682-8468-8ae6869f8205","conversationId":"cnv_5511d6b3-e8e5-4ab6-864c-162b929bbce2","sender":"qa-d2b694b50248","body":"4","createdAt":"2026-11-25T11:27:59.310240373Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_5511d6b3-e8e5-4ab6-864c-162b929bbce2/messages
correlation: qa-2493c749-7dbd-4fc8-8f75-8be677e5a451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2493c749-7dbd-4fc8-8f75-8be677e5a451
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2493c749-7dbd-4fc8-8f75-8be677e5a451
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

{"id":"msg_9bb17338-088e-4525-a559-28a2067d953d","conversationId":"cnv_5511d6b3-e8e5-4ab6-864c-162b929bbce2","sender":"qa-d2b694b50248","body":"5","createdAt":"2026-11-25T11:27:59.348441951Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-46152438-0556-4ad1-a1cf-20c5c8d136d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46152438-0556-4ad1-a1cf-20c5c8d136d7
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-46152438-0556-4ad1-a1cf-20c5c8d136d7
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

{"balance":0,"currency":"credits","accountId":"acc_e23274db-45e7-4177-b62f-f0740441e971"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-2fd33830-f0a1-4fff-8270-e7d123b8fbd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fd33830-f0a1-4fff-8270-e7d123b8fbd8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3f090567ee3c","subject":"One more","message":"Hi"}

--- response: 402 in 4 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fd33830-f0a1-4fff-8270-e7d123b8fbd8
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-2fd33830-f0a1-4fff-8270-e7d123b8fbd8"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-02286110-766e-4ec9-ba38-7b918052b8dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02286110-766e-4ec9-ba38-7b918052b8dd
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-02286110-766e-4ec9-ba38-7b918052b8dd
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

{"items":[{"id":"led_660d6671-ca04-42cc-814b-ac2850daa689","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-25T11:27:59.070000707Z"},{"id":"led_1c5cdb37-d0fc-4604-b580-bfec1c0e9112","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_5511d6b3-e8e5-4ab6-864c-162b929bbce2","createdAt":"2026-11-25T11:27:59.184227621Z"},{"id":"led_6bcb5d27-d361-4615-a54e-19b6fb5590a7","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_88cc44e8-3b11-42c4-a830-baca01d6f698","createdAt":"2026-11-25T11:27:59.209247595Z"},{"id":"led_54764159-d8e7-4bcb-b708-8d0e54dedc0e","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_34e0acf3-352d-483c-8b83-e6b1d82d451a","createdAt":"2026-11-25T11:27:59.250048810Z"},{"id":"led_17e81126-16b1-4423-871a-18c1907ff5e1","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_68ea06e3-204c-4682-8468-8ae6869f8205","createdAt":"2026-11-25T11:27:59.310232547Z"},{"id":"led_484d1074-a440-4969-b412-2a3a0548bf6f","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_9bb17338-088e-4525-a559-28a2067d953d","createdAt":"2026-11-25T11:27:59.348436363Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-2cb1ef60-d501-4348-b0d2-8604feb894e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cb1ef60-d501-4348-b0d2-8604feb894e7
Content-Type: application/json

--- request body ---
{"handle":"qa-3f090567ee3c","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cb1ef60-d501-4348-b0d2-8604feb894e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7ac32403-0780-4428-9df2-3f9f530865fd"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b3308b3b-78b7-43b3-a1d0-8200f3c8206e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3308b3b-78b7-43b3-a1d0-8200f3c8206e
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b3308b3b-78b7-43b3-a1d0-8200f3c8206e
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
correlation: qa-7d6c033d-8879-4f9b-8ca6-f5b8e0764fa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d6c033d-8879-4f9b-8ca6-f5b8e0764fa1
Content-Type: application/json

--- request body ---
{"handle":"qa-3f090567ee3c","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d6c033d-8879-4f9b-8ca6-f5b8e0764fa1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7d6c033d-8879-4f9b-8ca6-f5b8e0764fa1"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9eb978d8-28f7-4ba6-b114-98905e758ce8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9eb978d8-28f7-4ba6-b114-98905e758ce8
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9eb978d8-28f7-4ba6-b114-98905e758ce8
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
correlation: qa-bcd2c90a-a934-4d3e-b4bb-e071f2eab3a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcd2c90a-a934-4d3e-b4bb-e071f2eab3a8
Content-Type: application/json

--- request body ---
{"handle":"qa-d2b694b50248","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bcd2c90a-a934-4d3e-b4bb-e071f2eab3a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bcd2c90a-a934-4d3e-b4bb-e071f2eab3a8"}
```
