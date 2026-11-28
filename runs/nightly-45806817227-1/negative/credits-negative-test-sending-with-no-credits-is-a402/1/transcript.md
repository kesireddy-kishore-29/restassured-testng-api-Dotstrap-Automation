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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-018822ec-c30a-4c34-ac43-77349ed05f59` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-b7728299-d148-4e3a-b3f4-f9f1ec4266af` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-777f1a18-8808-47de-b942-362ecc93e932` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-268197b6-065c-4b14-aeae-7c631ed9f9aa` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 53 | `qa-59b86223-5889-4e18-8e6f-34e0d508b6d1` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-48b5ffc3-b399-4c73-acfb-86944e657b3b` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 7 | `qa-3676ffec-ddae-4c56-9822-7ad1bfe2a8c1` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-9b9214bc-b1a7-49d1-a1af-dbca3a057b22` |
| 9 | `GET /v1/credits/balance` | 200 | 7 | `qa-9c2c021d-9aeb-46d3-9644-9d072f644e68` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 18 | `qa-cde54817-96d8-48ab-850c-d95980fc392d` |
| 11 | `GET /v1/credits/ledger` | 200 | 11 | `qa-7b7bc8ca-7f15-43d7-9d0d-3b3b6544cf1c` |
| 12 | `POST /v1/auth/token` | 200 | 8 | `qa-4cb717ac-0142-49fe-8f9e-e2b48b8f59a1` |
| 13 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-7b776f82-f0f3-4729-8778-80afe8e0e064` |
| 14 | `POST /v1/auth/token` | 401 | 5 | `qa-73da0174-0113-4069-ad7c-3dabd8e03e3e` |
| 15 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-8fa44580-dbec-4997-b0b8-d3551c5ddb3f` |
| 16 | `POST /v1/auth/token` | 401 | 11 | `qa-a1487f35-16a1-4cb6-ab69-2fff2f0c4056` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-018822ec-c30a-4c34-ac43-77349ed05f59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-018822ec-c30a-4c34-ac43-77349ed05f59
Content-Type: application/json

--- request body ---
{"handle":"qa-10234c755d22","displayName":"QA 10234c755d22","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-018822ec-c30a-4c34-ac43-77349ed05f59
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
Location: /v1/accounts/qa-10234c755d22
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5b2febc6-0523-44f5-8c19-deec922ed2c3","handle":"qa-10234c755d22","displayName":"QA 10234c755d22","region":"eu","role":"user","createdAt":"2026-11-26T11:02:36.165391639Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b7728299-d148-4e3a-b3f4-f9f1ec4266af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7728299-d148-4e3a-b3f4-f9f1ec4266af
Content-Type: application/json

--- request body ---
{"handle":"qa-9b55cc1343ce","displayName":"QA 9b55cc1343ce","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7728299-d148-4e3a-b3f4-f9f1ec4266af
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
Location: /v1/accounts/qa-9b55cc1343ce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ee7198ac-bbdb-4c42-8c42-8f102648e16c","handle":"qa-9b55cc1343ce","displayName":"QA 9b55cc1343ce","region":"eu","role":"user","createdAt":"2026-11-26T11:02:36.193333645Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-777f1a18-8808-47de-b942-362ecc93e932

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-777f1a18-8808-47de-b942-362ecc93e932
Content-Type: application/json

--- request body ---
{"handle":"qa-10234c755d22","password":"****"}

--- response: 200 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-777f1a18-8808-47de-b942-362ecc93e932
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5b2febc6-0523-44f5-8c19-deec922ed2c3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-268197b6-065c-4b14-aeae-7c631ed9f9aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-268197b6-065c-4b14-aeae-7c631ed9f9aa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9b55cc1343ce","subject":"Many messages","message":"1"}

--- response: 201 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-268197b6-065c-4b14-aeae-7c631ed9f9aa
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
Location: /v1/conversations/cnv_8671ffe1-8ce3-47de-9bca-cc5f0369f77b
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_8671ffe1-8ce3-47de-9bca-cc5f0369f77b","subject":"Many messages","status":"open","region":"eu","participants":["qa-10234c755d22","qa-9b55cc1343ce"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:36.248520192Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_8671ffe1-8ce3-47de-9bca-cc5f0369f77b/messages
correlation: qa-59b86223-5889-4e18-8e6f-34e0d508b6d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59b86223-5889-4e18-8e6f-34e0d508b6d1
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 53 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-59b86223-5889-4e18-8e6f-34e0d508b6d1
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

{"id":"msg_22d01d62-507e-41d0-869c-002dbd483850","conversationId":"cnv_8671ffe1-8ce3-47de-9bca-cc5f0369f77b","sender":"qa-10234c755d22","body":"2","createdAt":"2026-11-26T11:02:36.304826687Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_8671ffe1-8ce3-47de-9bca-cc5f0369f77b/messages
correlation: qa-48b5ffc3-b399-4c73-acfb-86944e657b3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48b5ffc3-b399-4c73-acfb-86944e657b3b
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-48b5ffc3-b399-4c73-acfb-86944e657b3b
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

{"id":"msg_7ed07804-178d-48b6-abb1-0e6019e2cfef","conversationId":"cnv_8671ffe1-8ce3-47de-9bca-cc5f0369f77b","sender":"qa-10234c755d22","body":"3","createdAt":"2026-11-26T11:02:36.350209829Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_8671ffe1-8ce3-47de-9bca-cc5f0369f77b/messages
correlation: qa-3676ffec-ddae-4c56-9822-7ad1bfe2a8c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3676ffec-ddae-4c56-9822-7ad1bfe2a8c1
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3676ffec-ddae-4c56-9822-7ad1bfe2a8c1
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

{"id":"msg_59c0901f-72b9-4899-afea-bb73919a668a","conversationId":"cnv_8671ffe1-8ce3-47de-9bca-cc5f0369f77b","sender":"qa-10234c755d22","body":"4","createdAt":"2026-11-26T11:02:36.368234348Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_8671ffe1-8ce3-47de-9bca-cc5f0369f77b/messages
correlation: qa-9b9214bc-b1a7-49d1-a1af-dbca3a057b22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b9214bc-b1a7-49d1-a1af-dbca3a057b22
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b9214bc-b1a7-49d1-a1af-dbca3a057b22
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

{"id":"msg_8345639b-e221-4e28-b11b-c0552bb357e4","conversationId":"cnv_8671ffe1-8ce3-47de-9bca-cc5f0369f77b","sender":"qa-10234c755d22","body":"5","createdAt":"2026-11-26T11:02:36.389884432Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-9c2c021d-9aeb-46d3-9644-9d072f644e68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c2c021d-9aeb-46d3-9644-9d072f644e68
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c2c021d-9aeb-46d3-9644-9d072f644e68
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

{"balance":0,"currency":"credits","accountId":"acc_5b2febc6-0523-44f5-8c19-deec922ed2c3"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_8671ffe1-8ce3-47de-9bca-cc5f0369f77b/messages
correlation: qa-cde54817-96d8-48ab-850c-d95980fc392d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cde54817-96d8-48ab-850c-d95980fc392d
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cde54817-96d8-48ab-850c-d95980fc392d
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_8671ffe1-8ce3-47de-9bca-cc5f0369f77b/messages","correlationId":"qa-cde54817-96d8-48ab-850c-d95980fc392d"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-7b7bc8ca-7f15-43d7-9d0d-3b3b6544cf1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b7bc8ca-7f15-43d7-9d0d-3b3b6544cf1c
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b7bc8ca-7f15-43d7-9d0d-3b3b6544cf1c
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

{"items":[{"id":"led_76e927f0-0b63-46d0-ac10-baf8b1ca2e72","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-26T11:02:36.165408845Z"},{"id":"led_e8b24ec6-b04d-49eb-9d97-028809acf402","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_8671ffe1-8ce3-47de-9bca-cc5f0369f77b","createdAt":"2026-11-26T11:02:36.248494934Z"},{"id":"led_c921ca89-83a3-49eb-9022-76ba08b47048","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_22d01d62-507e-41d0-869c-002dbd483850","createdAt":"2026-11-26T11:02:36.304801870Z"},{"id":"led_508b874d-81d4-4139-90ac-307143e0afc5","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_7ed07804-178d-48b6-abb1-0e6019e2cfef","createdAt":"2026-11-26T11:02:36.350188637Z"},{"id":"led_7b12e94b-b3cc-475e-957f-95a115bd0009","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_59c0901f-72b9-4899-afea-bb73919a668a","createdAt":"2026-11-26T11:02:36.368199656Z"},{"id":"led_fe2d3d14-fb80-4e7c-aed5-a88258ae4efb","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_8345639b-e221-4e28-b11b-c0552bb357e4","createdAt":"2026-11-26T11:02:36.389860456Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-4cb717ac-0142-49fe-8f9e-e2b48b8f59a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cb717ac-0142-49fe-8f9e-e2b48b8f59a1
Content-Type: application/json

--- request body ---
{"handle":"qa-9b55cc1343ce","password":"****"}

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cb717ac-0142-49fe-8f9e-e2b48b8f59a1
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ee7198ac-bbdb-4c42-8c42-8f102648e16c"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7b776f82-f0f3-4729-8778-80afe8e0e064

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b776f82-f0f3-4729-8778-80afe8e0e064
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7b776f82-f0f3-4729-8778-80afe8e0e064
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
correlation: qa-73da0174-0113-4069-ad7c-3dabd8e03e3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73da0174-0113-4069-ad7c-3dabd8e03e3e
Content-Type: application/json

--- request body ---
{"handle":"qa-9b55cc1343ce","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73da0174-0113-4069-ad7c-3dabd8e03e3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-73da0174-0113-4069-ad7c-3dabd8e03e3e"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8fa44580-dbec-4997-b0b8-d3551c5ddb3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fa44580-dbec-4997-b0b8-d3551c5ddb3f
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8fa44580-dbec-4997-b0b8-d3551c5ddb3f
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
correlation: qa-a1487f35-16a1-4cb6-ab69-2fff2f0c4056

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1487f35-16a1-4cb6-ab69-2fff2f0c4056
Content-Type: application/json

--- request body ---
{"handle":"qa-10234c755d22","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1487f35-16a1-4cb6-ab69-2fff2f0c4056
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1487f35-16a1-4cb6-ab69-2fff2f0c4056"}
```
