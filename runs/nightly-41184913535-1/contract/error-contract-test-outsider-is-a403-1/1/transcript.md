# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 695 | `qa-36e1b2c7-1fd5-43ef-8921-ac90fe095ba6` |
| 2 | `POST /v1/accounts` | 201 | 67 | `qa-f168c3e7-dd38-4e74-a6eb-2f2774a8a5d4` |
| 3 | `POST /v1/accounts` | 201 | 51 | `qa-d401c9ba-6788-4953-ad62-39ac5e043485` |
| 4 | `POST /v1/auth/token` | 200 | 35 | `qa-d054ff9c-5066-4085-ac25-b39937de3981` |
| 5 | `POST /v1/conversations` | 201 | 65 | `qa-36365ddd-06b0-4bae-9f99-5b6dd2719baa` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-b02114a7-00f6-4193-ab4d-dc194fd7ac03` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 27 | `qa-6c352dec-09fb-4600-a7f4-4f9df21a8f2d` |
| 8 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-879fc519-be05-4766-a63d-d54214f5d184` |
| 9 | `POST /v1/auth/token` | 401 | 38 | `qa-691bfcdd-fb7a-4300-bf14-09516aeeb2a8` |
| 10 | `POST /v1/auth/token` | 200 | 55 | `qa-542b4a86-561c-49e8-86c7-e3de7e81946b` |
| 11 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-b804589d-3975-4616-9e48-048ce1f14fdc` |
| 12 | `POST /v1/auth/token` | 401 | 20 | `qa-9d47c77f-2bdc-4239-803e-83002b306431` |
| 13 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-fa9e47ff-0dcb-497e-823c-a59229bd65c8` |
| 14 | `POST /v1/auth/token` | 401 | 30 | `qa-2b20fd9e-4ec0-4bf0-bb67-457a6dfdcb7f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-36e1b2c7-1fd5-43ef-8921-ac90fe095ba6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36e1b2c7-1fd5-43ef-8921-ac90fe095ba6
Content-Type: application/json

--- request body ---
{"handle":"qa-59fd256e9fa5","displayName":"QA 59fd256e9fa5","password":"****","region":"eu"}

--- response: 201 in 695 ms ---
Date: Sat, 31 Oct 2026 08:31:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-36e1b2c7-1fd5-43ef-8921-ac90fe095ba6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Location: /v1/accounts/qa-59fd256e9fa5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_848e68bc-3611-491e-98f2-3351a79182f5","handle":"qa-59fd256e9fa5","displayName":"QA 59fd256e9fa5","region":"eu","role":"user","createdAt":"2026-10-31T08:31:32.894505201Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f168c3e7-dd38-4e74-a6eb-2f2774a8a5d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f168c3e7-dd38-4e74-a6eb-2f2774a8a5d4
Content-Type: application/json

--- request body ---
{"handle":"qa-c141e9759d03","displayName":"QA c141e9759d03","password":"****","region":"eu"}

--- response: 201 in 67 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f168c3e7-dd38-4e74-a6eb-2f2774a8a5d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Location: /v1/accounts/qa-c141e9759d03
X-Served-Region: eu
Content-Length: 181

{"id":"acc_38d05756-2099-4ce9-8a3e-b1debc4fafc1","handle":"qa-c141e9759d03","displayName":"QA c141e9759d03","region":"eu","role":"user","createdAt":"2026-10-31T08:31:33.313450386Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d401c9ba-6788-4953-ad62-39ac5e043485

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d401c9ba-6788-4953-ad62-39ac5e043485
Content-Type: application/json

--- request body ---
{"handle":"qa-4e44520f6e81","displayName":"QA 4e44520f6e81","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d401c9ba-6788-4953-ad62-39ac5e043485
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-4e44520f6e81
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5ec7192a-9028-4eab-9fcb-2dc160ef42df","handle":"qa-4e44520f6e81","displayName":"QA 4e44520f6e81","region":"eu","role":"user","createdAt":"2026-10-31T08:31:33.404219345Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d054ff9c-5066-4085-ac25-b39937de3981

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d054ff9c-5066-4085-ac25-b39937de3981
Content-Type: application/json

--- request body ---
{"handle":"qa-59fd256e9fa5","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d054ff9c-5066-4085-ac25-b39937de3981
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_848e68bc-3611-491e-98f2-3351a79182f5"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-36365ddd-06b0-4bae-9f99-5b6dd2719baa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36365ddd-06b0-4bae-9f99-5b6dd2719baa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c141e9759d03","subject":"Error contract","message":"Hi"}

--- response: 201 in 65 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-36365ddd-06b0-4bae-9f99-5b6dd2719baa
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
Location: /v1/conversations/cnv_534019dc-0653-4074-bf31-80d1d4c429d8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_534019dc-0653-4074-bf31-80d1d4c429d8","subject":"Error contract","status":"open","region":"eu","participants":["qa-59fd256e9fa5","qa-c141e9759d03"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:33.551792325Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b02114a7-00f6-4193-ab4d-dc194fd7ac03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b02114a7-00f6-4193-ab4d-dc194fd7ac03
Content-Type: application/json

--- request body ---
{"handle":"qa-4e44520f6e81","password":"****"}

--- response: 200 in 51 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b02114a7-00f6-4193-ab4d-dc194fd7ac03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ec7192a-9028-4eab-9fcb-2dc160ef42df"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_534019dc-0653-4074-bf31-80d1d4c429d8/messages
correlation: qa-6c352dec-09fb-4600-a7f4-4f9df21a8f2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c352dec-09fb-4600-a7f4-4f9df21a8f2d
Content-Type: application/json

--- response: 403 in 27 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c352dec-09fb-4600-a7f4-4f9df21a8f2d
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_534019dc-0653-4074-bf31-80d1d4c429d8/messages","correlationId":"qa-6c352dec-09fb-4600-a7f4-4f9df21a8f2d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-879fc519-be05-4766-a63d-d54214f5d184

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-879fc519-be05-4766-a63d-d54214f5d184
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-879fc519-be05-4766-a63d-d54214f5d184
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
correlation: qa-691bfcdd-fb7a-4300-bf14-09516aeeb2a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-691bfcdd-fb7a-4300-bf14-09516aeeb2a8
Content-Type: application/json

--- request body ---
{"handle":"qa-4e44520f6e81","password":"****"}

--- response: 401 in 38 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-691bfcdd-fb7a-4300-bf14-09516aeeb2a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-691bfcdd-fb7a-4300-bf14-09516aeeb2a8"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-542b4a86-561c-49e8-86c7-e3de7e81946b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-542b4a86-561c-49e8-86c7-e3de7e81946b
Content-Type: application/json

--- request body ---
{"handle":"qa-c141e9759d03","password":"****"}

--- response: 200 in 55 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-542b4a86-561c-49e8-86c7-e3de7e81946b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_38d05756-2099-4ce9-8a3e-b1debc4fafc1"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b804589d-3975-4616-9e48-048ce1f14fdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b804589d-3975-4616-9e48-048ce1f14fdc
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b804589d-3975-4616-9e48-048ce1f14fdc
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-9d47c77f-2bdc-4239-803e-83002b306431

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d47c77f-2bdc-4239-803e-83002b306431
Content-Type: application/json

--- request body ---
{"handle":"qa-c141e9759d03","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d47c77f-2bdc-4239-803e-83002b306431
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d47c77f-2bdc-4239-803e-83002b306431"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa9e47ff-0dcb-497e-823c-a59229bd65c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa9e47ff-0dcb-497e-823c-a59229bd65c8
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa9e47ff-0dcb-497e-823c-a59229bd65c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-2b20fd9e-4ec0-4bf0-bb67-457a6dfdcb7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b20fd9e-4ec0-4bf0-bb67-457a6dfdcb7f
Content-Type: application/json

--- request body ---
{"handle":"qa-59fd256e9fa5","password":"****"}

--- response: 401 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b20fd9e-4ec0-4bf0-bb67-457a6dfdcb7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b20fd9e-4ec0-4bf0-bb67-457a6dfdcb7f"}
```
