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
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-34af7260-08e7-4823-b913-cf2d83c22c38` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-639ddd93-1000-4184-8048-1edf1e290075` |
| 3 | `POST /v1/accounts` | 201 | 22 | `qa-b09f52ed-48a6-4314-9860-7bcc3f98820d` |
| 4 | `POST /v1/auth/token` | 200 | 33 | `qa-c4260a6a-7d48-416b-871a-7d025e4cf71d` |
| 5 | `POST /v1/conversations` | 201 | 14 | `qa-f9082317-a4ac-4758-b2dd-045bcfe53f46` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-0f065339-b864-4d85-8325-16ff68d55c7a` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 6 | `qa-5e2f619f-b7c6-4427-8ac7-5c72b9641750` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-eae37789-be87-4473-b90a-a705653695a6` |
| 9 | `POST /v1/auth/token` | 401 | 29 | `qa-44985556-af22-4ac1-9c64-ddd898d7f360` |
| 10 | `POST /v1/auth/token` | 200 | 31 | `qa-a2f91219-1400-4fe9-b019-ce929a05df2c` |
| 11 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-e0683a3e-9414-4542-8112-08c7c570e13c` |
| 12 | `POST /v1/auth/token` | 401 | 26 | `qa-24ac0e1f-e0c9-4fb0-ab89-c87672d96c3a` |
| 13 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-338c512f-98d6-42f1-8114-55baedda4b6e` |
| 14 | `POST /v1/auth/token` | 401 | 21 | `qa-c74ed552-8d28-4bd9-9df7-09d28890aa65` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-34af7260-08e7-4823-b913-cf2d83c22c38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34af7260-08e7-4823-b913-cf2d83c22c38
Content-Type: application/json

--- request body ---
{"handle":"qa-d24eda5c7c6e","displayName":"QA d24eda5c7c6e","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-34af7260-08e7-4823-b913-cf2d83c22c38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 10
Location: /v1/accounts/qa-d24eda5c7c6e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ae178003-92e9-45b0-b764-6ffc5ce36038","handle":"qa-d24eda5c7c6e","displayName":"QA d24eda5c7c6e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.553123329Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-639ddd93-1000-4184-8048-1edf1e290075

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-639ddd93-1000-4184-8048-1edf1e290075
Content-Type: application/json

--- request body ---
{"handle":"qa-6f6bcf7aa3b8","displayName":"QA 6f6bcf7aa3b8","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-639ddd93-1000-4184-8048-1edf1e290075
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Location: /v1/accounts/qa-6f6bcf7aa3b8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_48ec1219-92ec-4ba0-9458-3c3cc277fede","handle":"qa-6f6bcf7aa3b8","displayName":"QA 6f6bcf7aa3b8","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.577946506Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-b09f52ed-48a6-4314-9860-7bcc3f98820d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b09f52ed-48a6-4314-9860-7bcc3f98820d
Content-Type: application/json

--- request body ---
{"handle":"qa-ddcf2b8a4559","displayName":"QA ddcf2b8a4559","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-b09f52ed-48a6-4314-9860-7bcc3f98820d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Location: /v1/accounts/qa-ddcf2b8a4559
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b069595e-dcdc-4604-a6e4-0132edbd076c","handle":"qa-ddcf2b8a4559","displayName":"QA ddcf2b8a4559","region":"eu","role":"user","createdAt":"2026-11-22T09:54:40.615944956Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c4260a6a-7d48-416b-871a-7d025e4cf71d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4260a6a-7d48-416b-871a-7d025e4cf71d
Content-Type: application/json

--- request body ---
{"handle":"qa-d24eda5c7c6e","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4260a6a-7d48-416b-871a-7d025e4cf71d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ae178003-92e9-45b0-b764-6ffc5ce36038"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f9082317-a4ac-4758-b2dd-045bcfe53f46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9082317-a4ac-4758-b2dd-045bcfe53f46
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6f6bcf7aa3b8","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9082317-a4ac-4758-b2dd-045bcfe53f46
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
Location: /v1/conversations/cnv_93f84625-f40d-4a02-a4fa-25dc8f54f378
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_93f84625-f40d-4a02-a4fa-25dc8f54f378","subject":"Error contract","status":"open","region":"eu","participants":["qa-d24eda5c7c6e","qa-6f6bcf7aa3b8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:40.683609486Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0f065339-b864-4d85-8325-16ff68d55c7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f065339-b864-4d85-8325-16ff68d55c7a
Content-Type: application/json

--- request body ---
{"handle":"qa-ddcf2b8a4559","password":"****"}

--- response: 200 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f065339-b864-4d85-8325-16ff68d55c7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b069595e-dcdc-4604-a6e4-0132edbd076c"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_93f84625-f40d-4a02-a4fa-25dc8f54f378/read
correlation: qa-5e2f619f-b7c6-4427-8ac7-5c72b9641750

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e2f619f-b7c6-4427-8ac7-5c72b9641750
Content-Type: application/json

--- response: 403 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e2f619f-b7c6-4427-8ac7-5c72b9641750
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_93f84625-f40d-4a02-a4fa-25dc8f54f378/read","correlationId":"qa-5e2f619f-b7c6-4427-8ac7-5c72b9641750"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eae37789-be87-4473-b90a-a705653695a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eae37789-be87-4473-b90a-a705653695a6
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eae37789-be87-4473-b90a-a705653695a6
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
correlation: qa-44985556-af22-4ac1-9c64-ddd898d7f360

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44985556-af22-4ac1-9c64-ddd898d7f360
Content-Type: application/json

--- request body ---
{"handle":"qa-ddcf2b8a4559","password":"****"}

--- response: 401 in 29 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44985556-af22-4ac1-9c64-ddd898d7f360
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-44985556-af22-4ac1-9c64-ddd898d7f360"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-a2f91219-1400-4fe9-b019-ce929a05df2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2f91219-1400-4fe9-b019-ce929a05df2c
Content-Type: application/json

--- request body ---
{"handle":"qa-6f6bcf7aa3b8","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2f91219-1400-4fe9-b019-ce929a05df2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_48ec1219-92ec-4ba0-9458-3c3cc277fede"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e0683a3e-9414-4542-8112-08c7c570e13c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0683a3e-9414-4542-8112-08c7c570e13c
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e0683a3e-9414-4542-8112-08c7c570e13c
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
correlation: qa-24ac0e1f-e0c9-4fb0-ab89-c87672d96c3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24ac0e1f-e0c9-4fb0-ab89-c87672d96c3a
Content-Type: application/json

--- request body ---
{"handle":"qa-6f6bcf7aa3b8","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-24ac0e1f-e0c9-4fb0-ab89-c87672d96c3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-24ac0e1f-e0c9-4fb0-ab89-c87672d96c3a"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-338c512f-98d6-42f1-8114-55baedda4b6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-338c512f-98d6-42f1-8114-55baedda4b6e
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-338c512f-98d6-42f1-8114-55baedda4b6e
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-c74ed552-8d28-4bd9-9df7-09d28890aa65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c74ed552-8d28-4bd9-9df7-09d28890aa65
Content-Type: application/json

--- request body ---
{"handle":"qa-d24eda5c7c6e","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c74ed552-8d28-4bd9-9df7-09d28890aa65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c74ed552-8d28-4bd9-9df7-09d28890aa65"}
```
