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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-703e59a9-aea5-48cb-9df7-2ffd8a522887` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-f7fd5c53-8ece-4171-882a-2f07a2b413d2` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-c97f3019-6a2e-4932-9eaf-995baa688c3e` |
| 4 | `POST /v1/conversations` | 201 | 4 | `qa-d6521b66-cacb-4c08-b8dd-006c3272eb5a` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-9ba9675b-ec98-4c91-8e21-9f80f3f1cf1b` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-a2d4bc5d-b7e4-4f32-91c6-d8aba8f53f10` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-2b519e31-a385-414f-81f0-64d8b7d02ea5` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-e37adc79-bf40-4db5-ba12-90ca0d1c29ae` |
| 9 | `GET /v1/credits/balance` | 200 | 13 | `qa-9664e066-a50a-43e1-a5b1-0b90386d90bf` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 12 | `qa-7db8960a-7b0b-4db5-b534-1554eed4b7df` |
| 11 | `GET /v1/credits/ledger` | 200 | 16 | `qa-ab29c1e7-a618-41ff-8880-4fb9a3befe59` |
| 12 | `POST /v1/auth/token` | 200 | 8 | `qa-b6f66820-949f-4eef-a74f-160d4f9b5bd0` |
| 13 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-c63ed42d-380f-49c6-942a-3d64f3503da6` |
| 14 | `POST /v1/auth/token` | 401 | 4 | `qa-5d3c1467-fd0a-4df1-a522-d79281fd83c2` |
| 15 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-d4e0d36a-361f-4de5-838c-be9033ecb4bf` |
| 16 | `POST /v1/auth/token` | 401 | 7 | `qa-7bb2b45b-57b3-4a26-b241-b3acd64fa896` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-703e59a9-aea5-48cb-9df7-2ffd8a522887

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-703e59a9-aea5-48cb-9df7-2ffd8a522887
Content-Type: application/json

--- request body ---
{"handle":"qa-4d9f55c43b6b","displayName":"QA 4d9f55c43b6b","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-703e59a9-aea5-48cb-9df7-2ffd8a522887
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
Location: /v1/accounts/qa-4d9f55c43b6b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4e5f0aa5-6eed-4f79-a6a9-6b4da29b4d78","handle":"qa-4d9f55c43b6b","displayName":"QA 4d9f55c43b6b","region":"eu","role":"user","createdAt":"2026-11-06T09:30:29.626606492Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f7fd5c53-8ece-4171-882a-2f07a2b413d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7fd5c53-8ece-4171-882a-2f07a2b413d2
Content-Type: application/json

--- request body ---
{"handle":"qa-93ad1d0e3f0e","displayName":"QA 93ad1d0e3f0e","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7fd5c53-8ece-4171-882a-2f07a2b413d2
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
Location: /v1/accounts/qa-93ad1d0e3f0e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8eabcdc5-368e-4b09-a684-22c309ce0c08","handle":"qa-93ad1d0e3f0e","displayName":"QA 93ad1d0e3f0e","region":"eu","role":"user","createdAt":"2026-11-06T09:30:29.662637428Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c97f3019-6a2e-4932-9eaf-995baa688c3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c97f3019-6a2e-4932-9eaf-995baa688c3e
Content-Type: application/json

--- request body ---
{"handle":"qa-4d9f55c43b6b","password":"****"}

--- response: 200 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-c97f3019-6a2e-4932-9eaf-995baa688c3e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4e5f0aa5-6eed-4f79-a6a9-6b4da29b4d78"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d6521b66-cacb-4c08-b8dd-006c3272eb5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6521b66-cacb-4c08-b8dd-006c3272eb5a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-93ad1d0e3f0e","subject":"Many messages","message":"1"}

--- response: 201 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6521b66-cacb-4c08-b8dd-006c3272eb5a
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
Location: /v1/conversations/cnv_f7471927-9fdc-4689-ab66-d9b4f64c6e84
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_f7471927-9fdc-4689-ab66-d9b4f64c6e84","subject":"Many messages","status":"open","region":"eu","participants":["qa-4d9f55c43b6b","qa-93ad1d0e3f0e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:29.697388436Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_f7471927-9fdc-4689-ab66-d9b4f64c6e84/messages
correlation: qa-9ba9675b-ec98-4c91-8e21-9f80f3f1cf1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ba9675b-ec98-4c91-8e21-9f80f3f1cf1b
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ba9675b-ec98-4c91-8e21-9f80f3f1cf1b
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

{"id":"msg_e76d8e68-6056-4e45-ae00-f13fd8b6ac2b","conversationId":"cnv_f7471927-9fdc-4689-ab66-d9b4f64c6e84","sender":"qa-4d9f55c43b6b","body":"2","createdAt":"2026-11-06T09:30:29.731317354Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_f7471927-9fdc-4689-ab66-d9b4f64c6e84/messages
correlation: qa-a2d4bc5d-b7e4-4f32-91c6-d8aba8f53f10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2d4bc5d-b7e4-4f32-91c6-d8aba8f53f10
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2d4bc5d-b7e4-4f32-91c6-d8aba8f53f10
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

{"id":"msg_bc366f6c-9cd2-4a17-bc75-4efb83fdc10e","conversationId":"cnv_f7471927-9fdc-4689-ab66-d9b4f64c6e84","sender":"qa-4d9f55c43b6b","body":"3","createdAt":"2026-11-06T09:30:29.771176309Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_f7471927-9fdc-4689-ab66-d9b4f64c6e84/messages
correlation: qa-2b519e31-a385-414f-81f0-64d8b7d02ea5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b519e31-a385-414f-81f0-64d8b7d02ea5
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b519e31-a385-414f-81f0-64d8b7d02ea5
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

{"id":"msg_9c15b8f5-39cc-46b0-a29f-02b3b50005ed","conversationId":"cnv_f7471927-9fdc-4689-ab66-d9b4f64c6e84","sender":"qa-4d9f55c43b6b","body":"4","createdAt":"2026-11-06T09:30:29.791763861Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_f7471927-9fdc-4689-ab66-d9b4f64c6e84/messages
correlation: qa-e37adc79-bf40-4db5-ba12-90ca0d1c29ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e37adc79-bf40-4db5-ba12-90ca0d1c29ae
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-e37adc79-bf40-4db5-ba12-90ca0d1c29ae
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

{"id":"msg_d829e8f2-1611-471c-9256-2b2dd9166aea","conversationId":"cnv_f7471927-9fdc-4689-ab66-d9b4f64c6e84","sender":"qa-4d9f55c43b6b","body":"5","createdAt":"2026-11-06T09:30:29.817342629Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-9664e066-a50a-43e1-a5b1-0b90386d90bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9664e066-a50a-43e1-a5b1-0b90386d90bf
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-9664e066-a50a-43e1-a5b1-0b90386d90bf
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

{"balance":0,"currency":"credits","accountId":"acc_4e5f0aa5-6eed-4f79-a6a9-6b4da29b4d78"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_f7471927-9fdc-4689-ab66-d9b4f64c6e84/messages
correlation: qa-7db8960a-7b0b-4db5-b534-1554eed4b7df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7db8960a-7b0b-4db5-b534-1554eed4b7df
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7db8960a-7b0b-4db5-b534-1554eed4b7df
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_f7471927-9fdc-4689-ab66-d9b4f64c6e84/messages","correlationId":"qa-7db8960a-7b0b-4db5-b534-1554eed4b7df"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-ab29c1e7-a618-41ff-8880-4fb9a3befe59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab29c1e7-a618-41ff-8880-4fb9a3befe59
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab29c1e7-a618-41ff-8880-4fb9a3befe59
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

{"items":[{"id":"led_e35070c5-c758-41c0-af62-52be63da1d97","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-06T09:30:29.626619475Z"},{"id":"led_5459f493-a572-4fe0-86e2-ce0b39683134","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_f7471927-9fdc-4689-ab66-d9b4f64c6e84","createdAt":"2026-11-06T09:30:29.697377483Z"},{"id":"led_952b2845-9163-4b40-94ca-63206c281d2a","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_e76d8e68-6056-4e45-ae00-f13fd8b6ac2b","createdAt":"2026-11-06T09:30:29.731305425Z"},{"id":"led_94ab6ef6-7b74-4d23-af3d-325ef83e7bae","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_bc366f6c-9cd2-4a17-bc75-4efb83fdc10e","createdAt":"2026-11-06T09:30:29.771154918Z"},{"id":"led_ee932e6a-7453-4f68-8ef5-19daf8c9dc0a","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_9c15b8f5-39cc-46b0-a29f-02b3b50005ed","createdAt":"2026-11-06T09:30:29.791740258Z"},{"id":"led_4eebdf73-acf1-4833-8c10-d1f94f407f21","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_d829e8f2-1611-471c-9256-2b2dd9166aea","createdAt":"2026-11-06T09:30:29.817313831Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-b6f66820-949f-4eef-a74f-160d4f9b5bd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6f66820-949f-4eef-a74f-160d4f9b5bd0
Content-Type: application/json

--- request body ---
{"handle":"qa-93ad1d0e3f0e","password":"****"}

--- response: 200 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6f66820-949f-4eef-a74f-160d4f9b5bd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8eabcdc5-368e-4b09-a684-22c309ce0c08"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c63ed42d-380f-49c6-942a-3d64f3503da6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c63ed42d-380f-49c6-942a-3d64f3503da6
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c63ed42d-380f-49c6-942a-3d64f3503da6
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
correlation: qa-5d3c1467-fd0a-4df1-a522-d79281fd83c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d3c1467-fd0a-4df1-a522-d79281fd83c2
Content-Type: application/json

--- request body ---
{"handle":"qa-93ad1d0e3f0e","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5d3c1467-fd0a-4df1-a522-d79281fd83c2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5d3c1467-fd0a-4df1-a522-d79281fd83c2"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d4e0d36a-361f-4de5-838c-be9033ecb4bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4e0d36a-361f-4de5-838c-be9033ecb4bf
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d4e0d36a-361f-4de5-838c-be9033ecb4bf
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
correlation: qa-7bb2b45b-57b3-4a26-b241-b3acd64fa896

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bb2b45b-57b3-4a26-b241-b3acd64fa896
Content-Type: application/json

--- request body ---
{"handle":"qa-4d9f55c43b6b","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7bb2b45b-57b3-4a26-b241-b3acd64fa896
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7bb2b45b-57b3-4a26-b241-b3acd64fa896"}
```
