# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-cb8f5315-e2e9-473f-a892-c4daaffc3ac0` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-2a74e49b-58f1-4525-80d2-fb1be79950f9` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-5133ad78-5cd9-48a2-8b2f-e71a951d8b26` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-57150b27-8cb8-4d7d-9ae1-66326dba632d` |
| 5 | `POST /v1/accounts` | 400 | 18 | `qa-32b419c0-192c-4497-ad13-35862178e155` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-722e85b6-aadd-4593-a7e7-4276018adb46` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-414d6ea7-1359-4c30-8aa2-bd476bf8eb46` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-081be403-1873-41ee-8c6e-52280c1fe8b7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-1f812531-b405-4da7-a059-534671cf46be` |
| 10 | `POST /v1/auth/token` | 401 | 66 | `qa-55046955-d767-4104-8ca0-18a3c7d78afc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cb8f5315-e2e9-473f-a892-c4daaffc3ac0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb8f5315-e2e9-473f-a892-c4daaffc3ac0
Content-Type: application/json

--- request body ---
{"handle":"qa-f115d7395f0e","displayName":"QA f115d7395f0e","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb8f5315-e2e9-473f-a892-c4daaffc3ac0
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
Location: /v1/accounts/qa-f115d7395f0e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a66d15c-ff55-4217-bdef-24d834bd23f0","handle":"qa-f115d7395f0e","displayName":"QA f115d7395f0e","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.037449533Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2a74e49b-58f1-4525-80d2-fb1be79950f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a74e49b-58f1-4525-80d2-fb1be79950f9
Content-Type: application/json

--- request body ---
{"handle":"qa-39c9eb3aaa29","displayName":"QA 39c9eb3aaa29","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a74e49b-58f1-4525-80d2-fb1be79950f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Location: /v1/accounts/qa-39c9eb3aaa29
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b3efa2e5-46e7-48fc-941b-978208014879","handle":"qa-39c9eb3aaa29","displayName":"QA 39c9eb3aaa29","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.088156060Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5133ad78-5cd9-48a2-8b2f-e71a951d8b26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5133ad78-5cd9-48a2-8b2f-e71a951d8b26
Content-Type: application/json

--- request body ---
{"handle":"qa-f115d7395f0e","password":"****"}

--- response: 200 in 44 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-5133ad78-5cd9-48a2-8b2f-e71a951d8b26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a66d15c-ff55-4217-bdef-24d834bd23f0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-57150b27-8cb8-4d7d-9ae1-66326dba632d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57150b27-8cb8-4d7d-9ae1-66326dba632d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-39c9eb3aaa29","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-57150b27-8cb8-4d7d-9ae1-66326dba632d
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
Location: /v1/conversations/cnv_b60005d9-28c7-491a-871a-dfbfa62f93d4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b60005d9-28c7-491a-871a-dfbfa62f93d4","subject":"Error contract","status":"open","region":"eu","participants":["qa-f115d7395f0e","qa-39c9eb3aaa29"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:24.185792928Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-32b419c0-192c-4497-ad13-35862178e155

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32b419c0-192c-4497-ad13-35862178e155
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32b419c0-192c-4497-ad13-35862178e155
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-32b419c0-192c-4497-ad13-35862178e155"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-722e85b6-aadd-4593-a7e7-4276018adb46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-722e85b6-aadd-4593-a7e7-4276018adb46
Content-Type: application/json

--- request body ---
{"handle":"qa-39c9eb3aaa29","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-722e85b6-aadd-4593-a7e7-4276018adb46
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b3efa2e5-46e7-48fc-941b-978208014879"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-414d6ea7-1359-4c30-8aa2-bd476bf8eb46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-414d6ea7-1359-4c30-8aa2-bd476bf8eb46
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-414d6ea7-1359-4c30-8aa2-bd476bf8eb46
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
correlation: qa-081be403-1873-41ee-8c6e-52280c1fe8b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-081be403-1873-41ee-8c6e-52280c1fe8b7
Content-Type: application/json

--- request body ---
{"handle":"qa-39c9eb3aaa29","password":"****"}

--- response: 401 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-081be403-1873-41ee-8c6e-52280c1fe8b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-081be403-1873-41ee-8c6e-52280c1fe8b7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1f812531-b405-4da7-a059-534671cf46be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f812531-b405-4da7-a059-534671cf46be
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1f812531-b405-4da7-a059-534671cf46be
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-55046955-d767-4104-8ca0-18a3c7d78afc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55046955-d767-4104-8ca0-18a3c7d78afc
Content-Type: application/json

--- request body ---
{"handle":"qa-f115d7395f0e","password":"****"}

--- response: 401 in 66 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55046955-d767-4104-8ca0-18a3c7d78afc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-55046955-d767-4104-8ca0-18a3c7d78afc"}
```
