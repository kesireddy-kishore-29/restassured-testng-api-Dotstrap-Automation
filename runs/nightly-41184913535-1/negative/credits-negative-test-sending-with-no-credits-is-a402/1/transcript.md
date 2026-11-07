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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-2ef0fead-9333-45b7-b87a-9601502e3165` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-a4ac4b3e-94ef-4f35-8480-5835879ea010` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-dd1d57cc-b28a-481f-99d7-6a7064f4df8e` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-51d40a11-21c0-46ef-81b0-15c63d8de101` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 49 | `qa-8397e096-aa5f-4abf-b277-67c5361c58a4` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 21 | `qa-17a6a24d-6718-40a5-8890-49297cb6aa26` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 23 | `qa-79bc41e5-2c50-4ced-9463-5514111f35af` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 22 | `qa-ea3b9561-ecef-46d2-9009-d963c9ba1f26` |
| 9 | `GET /v1/credits/balance` | 200 | 13 | `qa-d065c94e-e8ac-4c74-ada6-33f2a142dfff` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 19 | `qa-ab3879f2-da93-427b-92f4-e60eaa7873fd` |
| 11 | `GET /v1/credits/ledger` | 200 | 41 | `qa-ee701219-ea3c-41e2-bf21-8787b64b4e6c` |
| 12 | `POST /v1/auth/token` | 200 | 11 | `qa-aedbbc9e-770c-4565-b9c4-0edf7bd7dac1` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-747d45f7-ddff-47f1-b6c9-811da2af84b8` |
| 14 | `POST /v1/auth/token` | 401 | 9 | `qa-1e3ab01f-9e7e-4759-be68-c0f6991960e1` |
| 15 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-bcd988a9-3b03-4bb1-a058-582f5f9774b4` |
| 16 | `POST /v1/auth/token` | 401 | 11 | `qa-3e42189f-012c-4ff9-9443-222eddad7c7a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2ef0fead-9333-45b7-b87a-9601502e3165

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ef0fead-9333-45b7-b87a-9601502e3165
Content-Type: application/json

--- request body ---
{"handle":"qa-24417651f190","displayName":"QA 24417651f190","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ef0fead-9333-45b7-b87a-9601502e3165
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Location: /v1/accounts/qa-24417651f190
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e325a720-1549-4efa-a560-31fe9a3a1671","handle":"qa-24417651f190","displayName":"QA 24417651f190","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.505037038Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a4ac4b3e-94ef-4f35-8480-5835879ea010

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4ac4b3e-94ef-4f35-8480-5835879ea010
Content-Type: application/json

--- request body ---
{"handle":"qa-7772d9825365","displayName":"QA 7772d9825365","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4ac4b3e-94ef-4f35-8480-5835879ea010
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Location: /v1/accounts/qa-7772d9825365
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b5c1d8f7-1174-44bc-9031-0b9166351e50","handle":"qa-7772d9825365","displayName":"QA 7772d9825365","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.544522570Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dd1d57cc-b28a-481f-99d7-6a7064f4df8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd1d57cc-b28a-481f-99d7-6a7064f4df8e
Content-Type: application/json

--- request body ---
{"handle":"qa-24417651f190","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd1d57cc-b28a-481f-99d7-6a7064f4df8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e325a720-1549-4efa-a560-31fe9a3a1671"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-51d40a11-21c0-46ef-81b0-15c63d8de101

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51d40a11-21c0-46ef-81b0-15c63d8de101
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7772d9825365","subject":"Many messages","message":"1"}

--- response: 201 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-51d40a11-21c0-46ef-81b0-15c63d8de101
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
Location: /v1/conversations/cnv_b17562f3-01de-4c2d-81d6-a53c0e2d94f5
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_b17562f3-01de-4c2d-81d6-a53c0e2d94f5","subject":"Many messages","status":"open","region":"eu","participants":["qa-24417651f190","qa-7772d9825365"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:37.608260274Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_b17562f3-01de-4c2d-81d6-a53c0e2d94f5/messages
correlation: qa-8397e096-aa5f-4abf-b277-67c5361c58a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8397e096-aa5f-4abf-b277-67c5361c58a4
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 49 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8397e096-aa5f-4abf-b277-67c5361c58a4
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

{"id":"msg_ccb68564-0433-4797-9fa2-0b5e01732ce7","conversationId":"cnv_b17562f3-01de-4c2d-81d6-a53c0e2d94f5","sender":"qa-24417651f190","body":"2","createdAt":"2026-10-31T08:31:37.668413229Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_b17562f3-01de-4c2d-81d6-a53c0e2d94f5/messages
correlation: qa-17a6a24d-6718-40a5-8890-49297cb6aa26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17a6a24d-6718-40a5-8890-49297cb6aa26
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-17a6a24d-6718-40a5-8890-49297cb6aa26
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

{"id":"msg_7d8101bf-7154-4a70-9c9b-67aa60704f6b","conversationId":"cnv_b17562f3-01de-4c2d-81d6-a53c0e2d94f5","sender":"qa-24417651f190","body":"3","createdAt":"2026-10-31T08:31:37.717900589Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_b17562f3-01de-4c2d-81d6-a53c0e2d94f5/messages
correlation: qa-79bc41e5-2c50-4ced-9463-5514111f35af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79bc41e5-2c50-4ced-9463-5514111f35af
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-79bc41e5-2c50-4ced-9463-5514111f35af
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

{"id":"msg_0a76613a-1af4-4d16-af08-888cafb84a6d","conversationId":"cnv_b17562f3-01de-4c2d-81d6-a53c0e2d94f5","sender":"qa-24417651f190","body":"4","createdAt":"2026-10-31T08:31:37.767182737Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_b17562f3-01de-4c2d-81d6-a53c0e2d94f5/messages
correlation: qa-ea3b9561-ecef-46d2-9009-d963c9ba1f26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea3b9561-ecef-46d2-9009-d963c9ba1f26
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea3b9561-ecef-46d2-9009-d963c9ba1f26
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

{"id":"msg_976d21a0-aa79-4bac-b3ab-a16ec83f8542","conversationId":"cnv_b17562f3-01de-4c2d-81d6-a53c0e2d94f5","sender":"qa-24417651f190","body":"5","createdAt":"2026-10-31T08:31:37.804200117Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-d065c94e-e8ac-4c74-ada6-33f2a142dfff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d065c94e-e8ac-4c74-ada6-33f2a142dfff
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d065c94e-e8ac-4c74-ada6-33f2a142dfff
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

{"balance":0,"currency":"credits","accountId":"acc_e325a720-1549-4efa-a560-31fe9a3a1671"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_b17562f3-01de-4c2d-81d6-a53c0e2d94f5/messages
correlation: qa-ab3879f2-da93-427b-92f4-e60eaa7873fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab3879f2-da93-427b-92f4-e60eaa7873fd
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab3879f2-da93-427b-92f4-e60eaa7873fd
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_b17562f3-01de-4c2d-81d6-a53c0e2d94f5/messages","correlationId":"qa-ab3879f2-da93-427b-92f4-e60eaa7873fd"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-ee701219-ea3c-41e2-bf21-8787b64b4e6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee701219-ea3c-41e2-bf21-8787b64b4e6c
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee701219-ea3c-41e2-bf21-8787b64b4e6c
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

{"items":[{"id":"led_a79c580e-37b8-4dff-8628-6aef6760b1d5","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-31T08:31:37.505047648Z"},{"id":"led_531c0477-b41a-4219-a2ca-71b86efb6948","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_b17562f3-01de-4c2d-81d6-a53c0e2d94f5","createdAt":"2026-10-31T08:31:37.608216723Z"},{"id":"led_9b3a5f0a-19ea-4a78-bc71-8076cec3cba3","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_ccb68564-0433-4797-9fa2-0b5e01732ce7","createdAt":"2026-10-31T08:31:37.668368155Z"},{"id":"led_53a5e4ff-af4e-4b9f-bbce-c936faebaa09","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_7d8101bf-7154-4a70-9c9b-67aa60704f6b","createdAt":"2026-10-31T08:31:37.717864021Z"},{"id":"led_b3efeea4-5658-4780-b1bf-e5cce6521c6a","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_0a76613a-1af4-4d16-af08-888cafb84a6d","createdAt":"2026-10-31T08:31:37.767168019Z"},{"id":"led_676ed41c-86f7-47e2-9960-e032fa3b6010","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_976d21a0-aa79-4bac-b3ab-a16ec83f8542","createdAt":"2026-10-31T08:31:37.804158400Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-aedbbc9e-770c-4565-b9c4-0edf7bd7dac1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aedbbc9e-770c-4565-b9c4-0edf7bd7dac1
Content-Type: application/json

--- request body ---
{"handle":"qa-7772d9825365","password":"****"}

--- response: 200 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-aedbbc9e-770c-4565-b9c4-0edf7bd7dac1
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b5c1d8f7-1174-44bc-9031-0b9166351e50"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-747d45f7-ddff-47f1-b6c9-811da2af84b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-747d45f7-ddff-47f1-b6c9-811da2af84b8
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-747d45f7-ddff-47f1-b6c9-811da2af84b8
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
correlation: qa-1e3ab01f-9e7e-4759-be68-c0f6991960e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e3ab01f-9e7e-4759-be68-c0f6991960e1
Content-Type: application/json

--- request body ---
{"handle":"qa-7772d9825365","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e3ab01f-9e7e-4759-be68-c0f6991960e1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1e3ab01f-9e7e-4759-be68-c0f6991960e1"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bcd988a9-3b03-4bb1-a058-582f5f9774b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcd988a9-3b03-4bb1-a058-582f5f9774b4
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bcd988a9-3b03-4bb1-a058-582f5f9774b4
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
correlation: qa-3e42189f-012c-4ff9-9443-222eddad7c7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e42189f-012c-4ff9-9443-222eddad7c7a
Content-Type: application/json

--- request body ---
{"handle":"qa-24417651f190","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e42189f-012c-4ff9-9443-222eddad7c7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3e42189f-012c-4ff9-9443-222eddad7c7a"}
```
