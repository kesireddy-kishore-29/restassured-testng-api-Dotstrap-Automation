# Transcript: With no credits left, a message is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#sendingWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-00370437-8aa9-4bac-aaf1-aae970e00739` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-3a72aa2c-39e4-4a86-ba01-87db83a79189` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-c31e6fee-69d4-4f8f-a9de-9260961b2c70` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-3b78848e-6736-48d7-9b7c-4d007cbb5f2f` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 25 | `qa-002a4762-a2b3-4cbf-b8dd-aeba6fd42019` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-a8115a44-648d-47ef-84bd-ea0539c5add4` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 8 | `qa-fd9ed176-f0fa-4825-84d5-8af5b64c0f1a` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-b3085704-8b9c-474c-9687-77e456cd5d95` |
| 9 | `GET /v1/credits/balance` | 200 | 12 | `qa-7f656e75-ebcf-4842-80f0-6390cb280c49` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 17 | `qa-c1d9d3e8-e086-49de-be06-c27f23d6ae9c` |
| 11 | `GET /v1/credits/ledger` | 200 | 13 | `qa-6455e4c5-3286-457b-976f-6d41ba8a6edc` |
| 12 | `POST /v1/auth/token` | 200 | 17 | `qa-b3c9faab-0952-469f-a52d-7b714588df3f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-dc6032dc-260f-4e8f-a135-cdde50fa9200` |
| 14 | `POST /v1/auth/token` | 401 | 5 | `qa-22b44d2c-c5a9-46ae-9c19-7b15e481856b` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-bf22efe5-68fe-4e7e-a630-39b5bb76a955` |
| 16 | `POST /v1/auth/token` | 401 | 5 | `qa-556d4efe-9643-4bd2-8aa5-72a6e42fc9f0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-00370437-8aa9-4bac-aaf1-aae970e00739

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00370437-8aa9-4bac-aaf1-aae970e00739
Content-Type: application/json

--- request body ---
{"handle":"qa-3e64bfac9bce","displayName":"QA 3e64bfac9bce","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-00370437-8aa9-4bac-aaf1-aae970e00739
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-3e64bfac9bce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1312336b-5346-4dae-85cc-df4a63e5b3cd","handle":"qa-3e64bfac9bce","displayName":"QA 3e64bfac9bce","region":"eu","role":"user","createdAt":"2026-11-14T09:05:21.976821966Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a72aa2c-39e4-4a86-ba01-87db83a79189

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a72aa2c-39e4-4a86-ba01-87db83a79189
Content-Type: application/json

--- request body ---
{"handle":"qa-dd91c1a3fd3e","displayName":"QA dd91c1a3fd3e","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a72aa2c-39e4-4a86-ba01-87db83a79189
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-dd91c1a3fd3e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e464eb01-0c56-4ac3-bf96-f4c6a12bf163","handle":"qa-dd91c1a3fd3e","displayName":"QA dd91c1a3fd3e","region":"eu","role":"user","createdAt":"2026-11-14T09:05:22.005831317Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c31e6fee-69d4-4f8f-a9de-9260961b2c70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c31e6fee-69d4-4f8f-a9de-9260961b2c70
Content-Type: application/json

--- request body ---
{"handle":"qa-3e64bfac9bce","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-c31e6fee-69d4-4f8f-a9de-9260961b2c70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1312336b-5346-4dae-85cc-df4a63e5b3cd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3b78848e-6736-48d7-9b7c-4d007cbb5f2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b78848e-6736-48d7-9b7c-4d007cbb5f2f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dd91c1a3fd3e","subject":"Many messages","message":"1"}

--- response: 201 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b78848e-6736-48d7-9b7c-4d007cbb5f2f
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
Location: /v1/conversations/cnv_207ef721-0994-428e-a2bd-dadf1bc28240
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_207ef721-0994-428e-a2bd-dadf1bc28240","subject":"Many messages","status":"open","region":"eu","participants":["qa-3e64bfac9bce","qa-dd91c1a3fd3e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:22.080840701Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_207ef721-0994-428e-a2bd-dadf1bc28240/messages
correlation: qa-002a4762-a2b3-4cbf-b8dd-aeba6fd42019

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-002a4762-a2b3-4cbf-b8dd-aeba6fd42019
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-002a4762-a2b3-4cbf-b8dd-aeba6fd42019
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

{"id":"msg_5b242615-6530-4bab-b7bd-a8ba7356a3d8","conversationId":"cnv_207ef721-0994-428e-a2bd-dadf1bc28240","sender":"qa-3e64bfac9bce","body":"2","createdAt":"2026-11-14T09:05:22.115152472Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_207ef721-0994-428e-a2bd-dadf1bc28240/messages
correlation: qa-a8115a44-648d-47ef-84bd-ea0539c5add4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8115a44-648d-47ef-84bd-ea0539c5add4
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8115a44-648d-47ef-84bd-ea0539c5add4
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

{"id":"msg_c7467ce0-4a92-46a8-83a4-e122df019be0","conversationId":"cnv_207ef721-0994-428e-a2bd-dadf1bc28240","sender":"qa-3e64bfac9bce","body":"3","createdAt":"2026-11-14T09:05:22.162328725Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_207ef721-0994-428e-a2bd-dadf1bc28240/messages
correlation: qa-fd9ed176-f0fa-4825-84d5-8af5b64c0f1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd9ed176-f0fa-4825-84d5-8af5b64c0f1a
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd9ed176-f0fa-4825-84d5-8af5b64c0f1a
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

{"id":"msg_6486615e-80b9-4b00-83a5-d1e4de2e427c","conversationId":"cnv_207ef721-0994-428e-a2bd-dadf1bc28240","sender":"qa-3e64bfac9bce","body":"4","createdAt":"2026-11-14T09:05:22.187667032Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_207ef721-0994-428e-a2bd-dadf1bc28240/messages
correlation: qa-b3085704-8b9c-474c-9687-77e456cd5d95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3085704-8b9c-474c-9687-77e456cd5d95
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3085704-8b9c-474c-9687-77e456cd5d95
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

{"id":"msg_04446e06-c676-40a2-9255-b8e02e000202","conversationId":"cnv_207ef721-0994-428e-a2bd-dadf1bc28240","sender":"qa-3e64bfac9bce","body":"5","createdAt":"2026-11-14T09:05:22.201912413Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-7f656e75-ebcf-4842-80f0-6390cb280c49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f656e75-ebcf-4842-80f0-6390cb280c49
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f656e75-ebcf-4842-80f0-6390cb280c49
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

{"balance":0,"currency":"credits","accountId":"acc_1312336b-5346-4dae-85cc-df4a63e5b3cd"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_207ef721-0994-428e-a2bd-dadf1bc28240/messages
correlation: qa-c1d9d3e8-e086-49de-be06-c27f23d6ae9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1d9d3e8-e086-49de-be06-c27f23d6ae9c
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1d9d3e8-e086-49de-be06-c27f23d6ae9c
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
Content-Length: 320

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_207ef721-0994-428e-a2bd-dadf1bc28240/messages","correlationId":"qa-c1d9d3e8-e086-49de-be06-c27f23d6ae9c"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-6455e4c5-3286-457b-976f-6d41ba8a6edc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6455e4c5-3286-457b-976f-6d41ba8a6edc
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-6455e4c5-3286-457b-976f-6d41ba8a6edc
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

{"items":[{"id":"led_3bd29420-76e8-4cb1-bebc-d0ca98568d8f","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-14T09:05:21.976843336Z"},{"id":"led_a66a7c88-13e8-4b03-9681-31b113f0a72e","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_207ef721-0994-428e-a2bd-dadf1bc28240","createdAt":"2026-11-14T09:05:22.080823848Z"},{"id":"led_fc804b60-dc21-4dce-8efa-afdb6df5e6d7","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_5b242615-6530-4bab-b7bd-a8ba7356a3d8","createdAt":"2026-11-14T09:05:22.115124327Z"},{"id":"led_a26c2f2a-0673-464c-9b3e-68f30ad4f9fd","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_c7467ce0-4a92-46a8-83a4-e122df019be0","createdAt":"2026-11-14T09:05:22.162298057Z"},{"id":"led_f88379aa-17a5-40b2-94a9-3af6e2c7c356","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_6486615e-80b9-4b00-83a5-d1e4de2e427c","createdAt":"2026-11-14T09:05:22.187639615Z"},{"id":"led_68a5089e-b1d0-4682-b023-a7a1e37122a4","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_04446e06-c676-40a2-9255-b8e02e000202","createdAt":"2026-11-14T09:05:22.201872038Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-b3c9faab-0952-469f-a52d-7b714588df3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3c9faab-0952-469f-a52d-7b714588df3f
Content-Type: application/json

--- request body ---
{"handle":"qa-dd91c1a3fd3e","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3c9faab-0952-469f-a52d-7b714588df3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e464eb01-0c56-4ac3-bf96-f4c6a12bf163"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dc6032dc-260f-4e8f-a135-cdde50fa9200

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc6032dc-260f-4e8f-a135-cdde50fa9200
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dc6032dc-260f-4e8f-a135-cdde50fa9200
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
correlation: qa-22b44d2c-c5a9-46ae-9c19-7b15e481856b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22b44d2c-c5a9-46ae-9c19-7b15e481856b
Content-Type: application/json

--- request body ---
{"handle":"qa-dd91c1a3fd3e","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22b44d2c-c5a9-46ae-9c19-7b15e481856b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22b44d2c-c5a9-46ae-9c19-7b15e481856b"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bf22efe5-68fe-4e7e-a630-39b5bb76a955

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf22efe5-68fe-4e7e-a630-39b5bb76a955
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bf22efe5-68fe-4e7e-a630-39b5bb76a955
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
correlation: qa-556d4efe-9643-4bd2-8aa5-72a6e42fc9f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-556d4efe-9643-4bd2-8aa5-72a6e42fc9f0
Content-Type: application/json

--- request body ---
{"handle":"qa-3e64bfac9bce","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-556d4efe-9643-4bd2-8aa5-72a6e42fc9f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-556d4efe-9643-4bd2-8aa5-72a6e42fc9f0"}
```
