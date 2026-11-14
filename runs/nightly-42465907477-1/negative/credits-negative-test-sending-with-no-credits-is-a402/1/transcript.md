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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-6b68747d-ab32-4253-91e3-99e46aab9c13` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-c505eee7-f8e9-4e65-9948-be20af4ac077` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-b8339b18-a8d8-4d97-9143-c20e25316ef6` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-72bef238-635d-4a80-bbc0-2d22d17e94ca` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-de788008-a264-48f3-b034-c2a93191e241` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-fdec3379-3d64-45d6-ae66-8044b9ef6fc0` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-b5d2cb69-41e9-4b62-ba1f-15bbc30e06e9` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-d6eb0458-a2c5-407d-a043-32159fc56397` |
| 9 | `GET /v1/credits/balance` | 200 | 7 | `qa-16cb92fd-5601-479b-b573-c8fe4a557674` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 9 | `qa-4ce7a4f5-c868-41d4-9b0f-56ceab88bb64` |
| 11 | `GET /v1/credits/ledger` | 200 | 10 | `qa-4c2bd15f-363c-4abe-b2a0-d0b25d2d2ba9` |
| 12 | `POST /v1/auth/token` | 200 | 11 | `qa-ee052031-9fbe-4356-99ff-dcd85ea4cc8b` |
| 13 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-203ee4b3-d730-462a-aa9c-34d59c7bf6c9` |
| 14 | `POST /v1/auth/token` | 401 | 5 | `qa-1e9a0aaf-bbfe-46ac-a9bb-a259b2328cb2` |
| 15 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-0a2e77ea-259a-4716-b8dc-3aa2f250282c` |
| 16 | `POST /v1/auth/token` | 401 | 4 | `qa-d3efdc2b-f9c4-4183-87cf-754b523803b2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6b68747d-ab32-4253-91e3-99e46aab9c13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b68747d-ab32-4253-91e3-99e46aab9c13
Content-Type: application/json

--- request body ---
{"handle":"qa-147e82c25e97","displayName":"QA 147e82c25e97","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b68747d-ab32-4253-91e3-99e46aab9c13
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
Location: /v1/accounts/qa-147e82c25e97
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f1d7a23e-9474-48b7-b47a-94fb1afa20a8","handle":"qa-147e82c25e97","displayName":"QA 147e82c25e97","region":"eu","role":"user","createdAt":"2026-11-08T09:09:06.851546154Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c505eee7-f8e9-4e65-9948-be20af4ac077

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c505eee7-f8e9-4e65-9948-be20af4ac077
Content-Type: application/json

--- request body ---
{"handle":"qa-57ed73e462dc","displayName":"QA 57ed73e462dc","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-c505eee7-f8e9-4e65-9948-be20af4ac077
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-57ed73e462dc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c83e026a-02c6-4af4-8880-d424325788da","handle":"qa-57ed73e462dc","displayName":"QA 57ed73e462dc","region":"eu","role":"user","createdAt":"2026-11-08T09:09:06.891462549Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b8339b18-a8d8-4d97-9143-c20e25316ef6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8339b18-a8d8-4d97-9143-c20e25316ef6
Content-Type: application/json

--- request body ---
{"handle":"qa-147e82c25e97","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8339b18-a8d8-4d97-9143-c20e25316ef6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1d7a23e-9474-48b7-b47a-94fb1afa20a8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-72bef238-635d-4a80-bbc0-2d22d17e94ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72bef238-635d-4a80-bbc0-2d22d17e94ca
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-57ed73e462dc","subject":"Many messages","message":"1"}

--- response: 201 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-72bef238-635d-4a80-bbc0-2d22d17e94ca
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
Location: /v1/conversations/cnv_1c4d2d56-7577-41b9-a897-4be4f5fcde6d
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_1c4d2d56-7577-41b9-a897-4be4f5fcde6d","subject":"Many messages","status":"open","region":"eu","participants":["qa-147e82c25e97","qa-57ed73e462dc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:06.929643424Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_1c4d2d56-7577-41b9-a897-4be4f5fcde6d/messages
correlation: qa-de788008-a264-48f3-b034-c2a93191e241

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de788008-a264-48f3-b034-c2a93191e241
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-de788008-a264-48f3-b034-c2a93191e241
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

{"id":"msg_307a3d25-fe8b-46a8-a3f4-885aa5b45af2","conversationId":"cnv_1c4d2d56-7577-41b9-a897-4be4f5fcde6d","sender":"qa-147e82c25e97","body":"2","createdAt":"2026-11-08T09:09:06.945112627Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_1c4d2d56-7577-41b9-a897-4be4f5fcde6d/messages
correlation: qa-fdec3379-3d64-45d6-ae66-8044b9ef6fc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdec3379-3d64-45d6-ae66-8044b9ef6fc0
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdec3379-3d64-45d6-ae66-8044b9ef6fc0
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

{"id":"msg_fa99383c-9288-49e6-b4b4-26c6fe904708","conversationId":"cnv_1c4d2d56-7577-41b9-a897-4be4f5fcde6d","sender":"qa-147e82c25e97","body":"3","createdAt":"2026-11-08T09:09:06.960302020Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_1c4d2d56-7577-41b9-a897-4be4f5fcde6d/messages
correlation: qa-b5d2cb69-41e9-4b62-ba1f-15bbc30e06e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5d2cb69-41e9-4b62-ba1f-15bbc30e06e9
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5d2cb69-41e9-4b62-ba1f-15bbc30e06e9
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

{"id":"msg_b601782b-ed0c-4201-b04a-084699e95a3e","conversationId":"cnv_1c4d2d56-7577-41b9-a897-4be4f5fcde6d","sender":"qa-147e82c25e97","body":"4","createdAt":"2026-11-08T09:09:06.978048172Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_1c4d2d56-7577-41b9-a897-4be4f5fcde6d/messages
correlation: qa-d6eb0458-a2c5-407d-a043-32159fc56397

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6eb0458-a2c5-407d-a043-32159fc56397
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6eb0458-a2c5-407d-a043-32159fc56397
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

{"id":"msg_ee1fb8a4-f6ac-41a8-a66b-0ebb00f0a7df","conversationId":"cnv_1c4d2d56-7577-41b9-a897-4be4f5fcde6d","sender":"qa-147e82c25e97","body":"5","createdAt":"2026-11-08T09:09:06.989989129Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-16cb92fd-5601-479b-b573-c8fe4a557674

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16cb92fd-5601-479b-b573-c8fe4a557674
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-16cb92fd-5601-479b-b573-c8fe4a557674
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

{"balance":0,"currency":"credits","accountId":"acc_f1d7a23e-9474-48b7-b47a-94fb1afa20a8"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_1c4d2d56-7577-41b9-a897-4be4f5fcde6d/messages
correlation: qa-4ce7a4f5-c868-41d4-9b0f-56ceab88bb64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ce7a4f5-c868-41d4-9b0f-56ceab88bb64
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ce7a4f5-c868-41d4-9b0f-56ceab88bb64
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_1c4d2d56-7577-41b9-a897-4be4f5fcde6d/messages","correlationId":"qa-4ce7a4f5-c868-41d4-9b0f-56ceab88bb64"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-4c2bd15f-363c-4abe-b2a0-d0b25d2d2ba9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c2bd15f-363c-4abe-b2a0-d0b25d2d2ba9
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c2bd15f-363c-4abe-b2a0-d0b25d2d2ba9
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

{"items":[{"id":"led_5fa4e7d0-5092-49fe-8346-f3a949a99afb","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-08T09:09:06.851562789Z"},{"id":"led_81db48b3-a712-4203-8d65-95b9a9868fc8","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_1c4d2d56-7577-41b9-a897-4be4f5fcde6d","createdAt":"2026-11-08T09:09:06.929611996Z"},{"id":"led_b8336511-5571-4033-9dac-49f9f6128cf1","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_307a3d25-fe8b-46a8-a3f4-885aa5b45af2","createdAt":"2026-11-08T09:09:06.945101590Z"},{"id":"led_899e12cd-125f-406b-b288-843db5e16b2d","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_fa99383c-9288-49e6-b4b4-26c6fe904708","createdAt":"2026-11-08T09:09:06.960274569Z"},{"id":"led_a1addfa6-dd70-4422-98d3-d0c9da718513","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_b601782b-ed0c-4201-b04a-084699e95a3e","createdAt":"2026-11-08T09:09:06.978027551Z"},{"id":"led_6ffad51d-0929-4240-9b8e-396362d9bdfe","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_ee1fb8a4-f6ac-41a8-a66b-0ebb00f0a7df","createdAt":"2026-11-08T09:09:06.989956550Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-ee052031-9fbe-4356-99ff-dcd85ea4cc8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee052031-9fbe-4356-99ff-dcd85ea4cc8b
Content-Type: application/json

--- request body ---
{"handle":"qa-57ed73e462dc","password":"****"}

--- response: 200 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee052031-9fbe-4356-99ff-dcd85ea4cc8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c83e026a-02c6-4af4-8880-d424325788da"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-203ee4b3-d730-462a-aa9c-34d59c7bf6c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-203ee4b3-d730-462a-aa9c-34d59c7bf6c9
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-203ee4b3-d730-462a-aa9c-34d59c7bf6c9
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
correlation: qa-1e9a0aaf-bbfe-46ac-a9bb-a259b2328cb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e9a0aaf-bbfe-46ac-a9bb-a259b2328cb2
Content-Type: application/json

--- request body ---
{"handle":"qa-57ed73e462dc","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e9a0aaf-bbfe-46ac-a9bb-a259b2328cb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1e9a0aaf-bbfe-46ac-a9bb-a259b2328cb2"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0a2e77ea-259a-4716-b8dc-3aa2f250282c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a2e77ea-259a-4716-b8dc-3aa2f250282c
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0a2e77ea-259a-4716-b8dc-3aa2f250282c
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
correlation: qa-d3efdc2b-f9c4-4183-87cf-754b523803b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3efdc2b-f9c4-4183-87cf-754b523803b2
Content-Type: application/json

--- request body ---
{"handle":"qa-147e82c25e97","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d3efdc2b-f9c4-4183-87cf-754b523803b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d3efdc2b-f9c4-4183-87cf-754b523803b2"}
```
