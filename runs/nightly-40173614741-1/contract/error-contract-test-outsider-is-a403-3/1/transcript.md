# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-776171eb-3bfe-4bf9-9c39-703129bb8ec9` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-bbb3f8ed-9412-4033-b711-2ccc46adb2c3` |
| 3 | `POST /v1/accounts` | 201 | 31 | `qa-115a89d7-5a7b-4f0b-a95a-f8ff2baa418d` |
| 4 | `POST /v1/auth/token` | 200 | 48 | `qa-309923c6-bf28-41db-9a5b-2a777fa16a0c` |
| 5 | `POST /v1/conversations` | 201 | 8 | `qa-54856fc7-78b7-48e0-9d49-17206c535c1c` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-c9a9666e-0fd0-4201-b9e6-6aca2bb5ed8b` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 7 | `qa-0f4de686-d98d-452c-97f0-9b154e4a502c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-c123fd10-2af3-487f-a30e-7d70e1464bfc` |
| 9 | `POST /v1/auth/token` | 401 | 25 | `qa-43c9cde9-9207-438d-a62b-2c937d6f9864` |
| 10 | `POST /v1/auth/token` | 200 | 38 | `qa-f54a0e56-3091-449d-99e0-a07992e33813` |
| 11 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-6c2eb59a-7149-4e9a-bd13-3f45bf7b2d7b` |
| 12 | `POST /v1/auth/token` | 401 | 33 | `qa-80a3a39c-4414-4dc7-a237-ce858b1d6a71` |
| 13 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-058881c3-3e31-417e-a175-fa1723836f25` |
| 14 | `POST /v1/auth/token` | 401 | 16 | `qa-5bd35e94-6b37-49af-a66e-d1f1cd79be09` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-776171eb-3bfe-4bf9-9c39-703129bb8ec9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-776171eb-3bfe-4bf9-9c39-703129bb8ec9
Content-Type: application/json

--- request body ---
{"handle":"qa-fa5d4e6ed61f","displayName":"QA fa5d4e6ed61f","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-776171eb-3bfe-4bf9-9c39-703129bb8ec9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Location: /v1/accounts/qa-fa5d4e6ed61f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_af848285-b470-498d-8b67-d8279a3dbfa8","handle":"qa-fa5d4e6ed61f","displayName":"QA fa5d4e6ed61f","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.282520927Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bbb3f8ed-9412-4033-b711-2ccc46adb2c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbb3f8ed-9412-4033-b711-2ccc46adb2c3
Content-Type: application/json

--- request body ---
{"handle":"qa-13142998d7b8","displayName":"QA 13142998d7b8","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbb3f8ed-9412-4033-b711-2ccc46adb2c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Location: /v1/accounts/qa-13142998d7b8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dc4d4152-8705-4fac-b692-e87b3fadc739","handle":"qa-13142998d7b8","displayName":"QA 13142998d7b8","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.334741692Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-115a89d7-5a7b-4f0b-a95a-f8ff2baa418d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-115a89d7-5a7b-4f0b-a95a-f8ff2baa418d
Content-Type: application/json

--- request body ---
{"handle":"qa-a6898c6884d2","displayName":"QA a6898c6884d2","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-115a89d7-5a7b-4f0b-a95a-f8ff2baa418d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Location: /v1/accounts/qa-a6898c6884d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_16cdc6a6-eb24-4fa5-921e-816a82d284a2","handle":"qa-a6898c6884d2","displayName":"QA a6898c6884d2","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.386979600Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-309923c6-bf28-41db-9a5b-2a777fa16a0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-309923c6-bf28-41db-9a5b-2a777fa16a0c
Content-Type: application/json

--- request body ---
{"handle":"qa-fa5d4e6ed61f","password":"****"}

--- response: 200 in 48 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-309923c6-bf28-41db-9a5b-2a777fa16a0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_af848285-b470-498d-8b67-d8279a3dbfa8"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-54856fc7-78b7-48e0-9d49-17206c535c1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54856fc7-78b7-48e0-9d49-17206c535c1c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-13142998d7b8","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-54856fc7-78b7-48e0-9d49-17206c535c1c
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
Location: /v1/conversations/cnv_26479b7b-7470-4f83-918a-d50edf062f87
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_26479b7b-7470-4f83-918a-d50edf062f87","subject":"Error contract","status":"open","region":"eu","participants":["qa-fa5d4e6ed61f","qa-13142998d7b8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:24.466084603Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c9a9666e-0fd0-4201-b9e6-6aca2bb5ed8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9a9666e-0fd0-4201-b9e6-6aca2bb5ed8b
Content-Type: application/json

--- request body ---
{"handle":"qa-a6898c6884d2","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9a9666e-0fd0-4201-b9e6-6aca2bb5ed8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_16cdc6a6-eb24-4fa5-921e-816a82d284a2"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_26479b7b-7470-4f83-918a-d50edf062f87/read
correlation: qa-0f4de686-d98d-452c-97f0-9b154e4a502c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f4de686-d98d-452c-97f0-9b154e4a502c
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f4de686-d98d-452c-97f0-9b154e4a502c
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_26479b7b-7470-4f83-918a-d50edf062f87/read","correlationId":"qa-0f4de686-d98d-452c-97f0-9b154e4a502c"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c123fd10-2af3-487f-a30e-7d70e1464bfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c123fd10-2af3-487f-a30e-7d70e1464bfc
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c123fd10-2af3-487f-a30e-7d70e1464bfc
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
correlation: qa-43c9cde9-9207-438d-a62b-2c937d6f9864

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43c9cde9-9207-438d-a62b-2c937d6f9864
Content-Type: application/json

--- request body ---
{"handle":"qa-a6898c6884d2","password":"****"}

--- response: 401 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43c9cde9-9207-438d-a62b-2c937d6f9864
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-43c9cde9-9207-438d-a62b-2c937d6f9864"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-f54a0e56-3091-449d-99e0-a07992e33813

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f54a0e56-3091-449d-99e0-a07992e33813
Content-Type: application/json

--- request body ---
{"handle":"qa-13142998d7b8","password":"****"}

--- response: 200 in 38 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f54a0e56-3091-449d-99e0-a07992e33813
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dc4d4152-8705-4fac-b692-e87b3fadc739"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6c2eb59a-7149-4e9a-bd13-3f45bf7b2d7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c2eb59a-7149-4e9a-bd13-3f45bf7b2d7b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6c2eb59a-7149-4e9a-bd13-3f45bf7b2d7b
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
correlation: qa-80a3a39c-4414-4dc7-a237-ce858b1d6a71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80a3a39c-4414-4dc7-a237-ce858b1d6a71
Content-Type: application/json

--- request body ---
{"handle":"qa-13142998d7b8","password":"****"}

--- response: 401 in 33 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80a3a39c-4414-4dc7-a237-ce858b1d6a71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-80a3a39c-4414-4dc7-a237-ce858b1d6a71"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-058881c3-3e31-417e-a175-fa1723836f25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-058881c3-3e31-417e-a175-fa1723836f25
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-058881c3-3e31-417e-a175-fa1723836f25
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
correlation: qa-5bd35e94-6b37-49af-a66e-d1f1cd79be09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bd35e94-6b37-49af-a66e-d1f1cd79be09
Content-Type: application/json

--- request body ---
{"handle":"qa-fa5d4e6ed61f","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5bd35e94-6b37-49af-a66e-d1f1cd79be09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5bd35e94-6b37-49af-a66e-d1f1cd79be09"}
```
