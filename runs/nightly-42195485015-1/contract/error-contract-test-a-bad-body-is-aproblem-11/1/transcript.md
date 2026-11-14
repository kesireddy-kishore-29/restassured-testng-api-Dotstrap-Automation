# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-bf57988d-5e25-4d7f-8def-a493212fc376` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-0dea17bf-8eae-4776-8014-61ea8e3f2011` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-dbf68b36-c381-4af3-a5a7-7fb6ab45a0a0` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-be96c5ac-7f87-4e4d-b430-9f2b77ac1b24` |
| 5 | `POST /v1/conversations` | 422 | 15 | `qa-4c57b4c9-b5c4-4a4a-8837-1c501665c3e9` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-ec418f8d-584c-440f-80f9-dbe81fbe7606` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-05a74eda-21df-4f7a-88d1-d789670ff2f0` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-cfb768c4-0923-4d80-986b-e4eea04b44a9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-45f3c81a-a5de-4b75-90fa-5a6ae835dfad` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-0375c410-a172-4392-a593-3db909f1daf9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bf57988d-5e25-4d7f-8def-a493212fc376

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf57988d-5e25-4d7f-8def-a493212fc376
Content-Type: application/json

--- request body ---
{"handle":"qa-ffd14b905c77","displayName":"QA ffd14b905c77","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf57988d-5e25-4d7f-8def-a493212fc376
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 7
Location: /v1/accounts/qa-ffd14b905c77
X-Served-Region: eu
Content-Length: 181

{"id":"acc_68d475b6-f89a-42ad-8af4-89d96b7e7d8d","handle":"qa-ffd14b905c77","displayName":"QA ffd14b905c77","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.752275730Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0dea17bf-8eae-4776-8014-61ea8e3f2011

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dea17bf-8eae-4776-8014-61ea8e3f2011
Content-Type: application/json

--- request body ---
{"handle":"qa-94bbf965b55a","displayName":"QA 94bbf965b55a","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dea17bf-8eae-4776-8014-61ea8e3f2011
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 7
Location: /v1/accounts/qa-94bbf965b55a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_388ce7b6-85a3-4d5a-a3e4-1f5ce4c27ffe","handle":"qa-94bbf965b55a","displayName":"QA 94bbf965b55a","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.799040040Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dbf68b36-c381-4af3-a5a7-7fb6ab45a0a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbf68b36-c381-4af3-a5a7-7fb6ab45a0a0
Content-Type: application/json

--- request body ---
{"handle":"qa-ffd14b905c77","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbf68b36-c381-4af3-a5a7-7fb6ab45a0a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68d475b6-f89a-42ad-8af4-89d96b7e7d8d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-be96c5ac-7f87-4e4d-b430-9f2b77ac1b24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be96c5ac-7f87-4e4d-b430-9f2b77ac1b24
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-94bbf965b55a","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-be96c5ac-7f87-4e4d-b430-9f2b77ac1b24
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
Location: /v1/conversations/cnv_f016ea25-ec79-4b48-8198-6780b8f9f9ea
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f016ea25-ec79-4b48-8198-6780b8f9f9ea","subject":"Error contract","status":"open","region":"eu","participants":["qa-ffd14b905c77","qa-94bbf965b55a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.913355438Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-4c57b4c9-b5c4-4a4a-8837-1c501665c3e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c57b4c9-b5c4-4a4a-8837-1c501665c3e9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-94bbf965b55a","subject":" ","message":"Hi"}

--- response: 422 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c57b4c9-b5c4-4a4a-8837-1c501665c3e9
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-4c57b4c9-b5c4-4a4a-8837-1c501665c3e9","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ec418f8d-584c-440f-80f9-dbe81fbe7606

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec418f8d-584c-440f-80f9-dbe81fbe7606
Content-Type: application/json

--- request body ---
{"handle":"qa-94bbf965b55a","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec418f8d-584c-440f-80f9-dbe81fbe7606
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_388ce7b6-85a3-4d5a-a3e4-1f5ce4c27ffe"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-05a74eda-21df-4f7a-88d1-d789670ff2f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05a74eda-21df-4f7a-88d1-d789670ff2f0
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-05a74eda-21df-4f7a-88d1-d789670ff2f0
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-cfb768c4-0923-4d80-986b-e4eea04b44a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfb768c4-0923-4d80-986b-e4eea04b44a9
Content-Type: application/json

--- request body ---
{"handle":"qa-94bbf965b55a","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cfb768c4-0923-4d80-986b-e4eea04b44a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cfb768c4-0923-4d80-986b-e4eea04b44a9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-45f3c81a-a5de-4b75-90fa-5a6ae835dfad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45f3c81a-a5de-4b75-90fa-5a6ae835dfad
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-45f3c81a-a5de-4b75-90fa-5a6ae835dfad
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-0375c410-a172-4392-a593-3db909f1daf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0375c410-a172-4392-a593-3db909f1daf9
Content-Type: application/json

--- request body ---
{"handle":"qa-ffd14b905c77","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0375c410-a172-4392-a593-3db909f1daf9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0375c410-a172-4392-a593-3db909f1daf9"}
```
