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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-b3a80c41-e13b-427a-a22f-4f7ec2e78c17` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-0202e5c2-d064-4d50-828d-12c5cee2bac3` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-3a0cdbd2-3e3c-4571-b7c3-98d2d1f0c48a` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-94cc1ff8-6450-4442-8819-803d09e38c08` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-98ad1b09-0637-4e8c-a185-f0a8b644d18a` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-a3da7853-4f9b-47bc-b695-f85ddf93c2da` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-2c9d44e6-2402-4587-a1c0-9b8519c7afb8` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 24 | `qa-6da78d01-e590-470a-85d0-ff207d545d57` |
| 9 | `GET /v1/credits/balance` | 200 | 18 | `qa-15179c0e-a016-4942-8f60-d68079cd93a3` |
| 10 | `POST /v1/conversations` | 402 | 7 | `qa-64dbf194-4d71-4f22-b4fc-aa28a9fdc7fc` |
| 11 | `GET /v1/credits/ledger` | 200 | 9 | `qa-6f5fa1a2-84da-4b41-8aae-488bde6079d6` |
| 12 | `POST /v1/auth/token` | 200 | 32 | `qa-3494748b-ef01-4c2d-afce-573ec14d57f4` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-b5410913-0a23-4522-b1c4-b8074bee7321` |
| 14 | `POST /v1/auth/token` | 401 | 9 | `qa-d6f3de06-8f33-430f-889f-b72dfbbeafc6` |
| 15 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-d8d14a76-ae56-4ba3-9f4f-e3cc7190167b` |
| 16 | `POST /v1/auth/token` | 401 | 5 | `qa-56bc5707-3e48-4dfd-95a4-ad0a662ee4ac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b3a80c41-e13b-427a-a22f-4f7ec2e78c17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3a80c41-e13b-427a-a22f-4f7ec2e78c17
Content-Type: application/json

--- request body ---
{"handle":"qa-9c860df94ea5","displayName":"QA 9c860df94ea5","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3a80c41-e13b-427a-a22f-4f7ec2e78c17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 8
Location: /v1/accounts/qa-9c860df94ea5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc9f476a-61e5-4f7f-9050-a893d0e55a3a","handle":"qa-9c860df94ea5","displayName":"QA 9c860df94ea5","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.047244557Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0202e5c2-d064-4d50-828d-12c5cee2bac3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0202e5c2-d064-4d50-828d-12c5cee2bac3
Content-Type: application/json

--- request body ---
{"handle":"qa-fce10c82e18f","displayName":"QA fce10c82e18f","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-0202e5c2-d064-4d50-828d-12c5cee2bac3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Location: /v1/accounts/qa-fce10c82e18f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f7eff84a-a27b-45ca-95c0-c5c67e85b7d1","handle":"qa-fce10c82e18f","displayName":"QA fce10c82e18f","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.119579678Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3a0cdbd2-3e3c-4571-b7c3-98d2d1f0c48a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a0cdbd2-3e3c-4571-b7c3-98d2d1f0c48a
Content-Type: application/json

--- request body ---
{"handle":"qa-9c860df94ea5","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a0cdbd2-3e3c-4571-b7c3-98d2d1f0c48a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc9f476a-61e5-4f7f-9050-a893d0e55a3a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-94cc1ff8-6450-4442-8819-803d09e38c08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94cc1ff8-6450-4442-8819-803d09e38c08
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fce10c82e18f","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-94cc1ff8-6450-4442-8819-803d09e38c08
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
Location: /v1/conversations/cnv_e4f66d1c-c134-432d-b1f5-3275af383526
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e4f66d1c-c134-432d-b1f5-3275af383526","subject":"Error contract","status":"open","region":"eu","participants":["qa-9c860df94ea5","qa-fce10c82e18f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.163705684Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_e4f66d1c-c134-432d-b1f5-3275af383526/messages
correlation: qa-98ad1b09-0637-4e8c-a185-f0a8b644d18a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98ad1b09-0637-4e8c-a185-f0a8b644d18a
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-98ad1b09-0637-4e8c-a185-f0a8b644d18a
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

{"id":"msg_561ca61a-e8ea-4ba1-9df4-802a381d922d","conversationId":"cnv_e4f66d1c-c134-432d-b1f5-3275af383526","sender":"qa-9c860df94ea5","body":"2","createdAt":"2026-11-24T12:38:15.198035610Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_e4f66d1c-c134-432d-b1f5-3275af383526/messages
correlation: qa-a3da7853-4f9b-47bc-b695-f85ddf93c2da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3da7853-4f9b-47bc-b695-f85ddf93c2da
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3da7853-4f9b-47bc-b695-f85ddf93c2da
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

{"id":"msg_8caa5134-2ff3-4ef0-9067-cb2349f98532","conversationId":"cnv_e4f66d1c-c134-432d-b1f5-3275af383526","sender":"qa-9c860df94ea5","body":"3","createdAt":"2026-11-24T12:38:15.224289223Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_e4f66d1c-c134-432d-b1f5-3275af383526/messages
correlation: qa-2c9d44e6-2402-4587-a1c0-9b8519c7afb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c9d44e6-2402-4587-a1c0-9b8519c7afb8
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c9d44e6-2402-4587-a1c0-9b8519c7afb8
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

{"id":"msg_4dbbaabf-fb3d-4f98-8d85-0aed8a727bc5","conversationId":"cnv_e4f66d1c-c134-432d-b1f5-3275af383526","sender":"qa-9c860df94ea5","body":"4","createdAt":"2026-11-24T12:38:15.255369288Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_e4f66d1c-c134-432d-b1f5-3275af383526/messages
correlation: qa-6da78d01-e590-470a-85d0-ff207d545d57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6da78d01-e590-470a-85d0-ff207d545d57
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 24 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6da78d01-e590-470a-85d0-ff207d545d57
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

{"id":"msg_3d856e5c-728b-41f0-bd28-501871785859","conversationId":"cnv_e4f66d1c-c134-432d-b1f5-3275af383526","sender":"qa-9c860df94ea5","body":"5","createdAt":"2026-11-24T12:38:15.293146727Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-15179c0e-a016-4942-8f60-d68079cd93a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15179c0e-a016-4942-8f60-d68079cd93a3
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-15179c0e-a016-4942-8f60-d68079cd93a3
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

{"balance":0,"currency":"credits","accountId":"acc_cc9f476a-61e5-4f7f-9050-a893d0e55a3a"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-64dbf194-4d71-4f22-b4fc-aa28a9fdc7fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64dbf194-4d71-4f22-b4fc-aa28a9fdc7fc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fce10c82e18f","subject":"One more","message":"Hi"}

--- response: 402 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64dbf194-4d71-4f22-b4fc-aa28a9fdc7fc
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-64dbf194-4d71-4f22-b4fc-aa28a9fdc7fc"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-6f5fa1a2-84da-4b41-8aae-488bde6079d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f5fa1a2-84da-4b41-8aae-488bde6079d6
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f5fa1a2-84da-4b41-8aae-488bde6079d6
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

{"items":[{"id":"led_3a91a205-0860-4131-8890-8093ee0c5afd","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-24T12:38:15.047254340Z"},{"id":"led_33077eea-9aec-4772-b509-989bd6c30652","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_e4f66d1c-c134-432d-b1f5-3275af383526","createdAt":"2026-11-24T12:38:15.163696713Z"},{"id":"led_43da1946-5f0d-439c-8a9a-f0dd617f0057","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_561ca61a-e8ea-4ba1-9df4-802a381d922d","createdAt":"2026-11-24T12:38:15.198027837Z"},{"id":"led_6829380a-8f7f-48e6-a372-5fab985e86cc","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_8caa5134-2ff3-4ef0-9067-cb2349f98532","createdAt":"2026-11-24T12:38:15.224283132Z"},{"id":"led_41d59184-e091-4147-9d65-5d4d551cafc0","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_4dbbaabf-fb3d-4f98-8d85-0aed8a727bc5","createdAt":"2026-11-24T12:38:15.255351562Z"},{"id":"led_491fe9c4-2107-4e20-bbc8-742c20bf059f","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_3d856e5c-728b-41f0-bd28-501871785859","createdAt":"2026-11-24T12:38:15.293138909Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-3494748b-ef01-4c2d-afce-573ec14d57f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3494748b-ef01-4c2d-afce-573ec14d57f4
Content-Type: application/json

--- request body ---
{"handle":"qa-fce10c82e18f","password":"****"}

--- response: 200 in 32 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-3494748b-ef01-4c2d-afce-573ec14d57f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f7eff84a-a27b-45ca-95c0-c5c67e85b7d1"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b5410913-0a23-4522-b1c4-b8074bee7321

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5410913-0a23-4522-b1c4-b8074bee7321
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b5410913-0a23-4522-b1c4-b8074bee7321
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
correlation: qa-d6f3de06-8f33-430f-889f-b72dfbbeafc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6f3de06-8f33-430f-889f-b72dfbbeafc6
Content-Type: application/json

--- request body ---
{"handle":"qa-fce10c82e18f","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6f3de06-8f33-430f-889f-b72dfbbeafc6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d6f3de06-8f33-430f-889f-b72dfbbeafc6"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d8d14a76-ae56-4ba3-9f4f-e3cc7190167b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8d14a76-ae56-4ba3-9f4f-e3cc7190167b
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d8d14a76-ae56-4ba3-9f4f-e3cc7190167b
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
correlation: qa-56bc5707-3e48-4dfd-95a4-ad0a662ee4ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56bc5707-3e48-4dfd-95a4-ad0a662ee4ac
Content-Type: application/json

--- request body ---
{"handle":"qa-9c860df94ea5","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-56bc5707-3e48-4dfd-95a4-ad0a662ee4ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-56bc5707-3e48-4dfd-95a4-ad0a662ee4ac"}
```
