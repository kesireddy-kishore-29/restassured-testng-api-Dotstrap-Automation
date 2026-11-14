# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-6660b937-1ae0-4091-8643-5e487d86b91e` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-8af7f400-397e-4690-92b7-aa5fb15dd180` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-b11db429-6f16-4158-8788-df48830e954b` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-ba2fef0e-a09d-4249-89cd-9f1078437f70` |
| 5 | `POST /v1/accounts` | 503 | 11 | `qa-dc6dc261-9206-4bfa-afae-80193d3d7cb8` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-e219579f-5bf9-4aab-ba90-a11a702a7236` |
| 7 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-4ee47684-ba51-40e2-803a-8bc4aa3917d7` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-4e4e74b9-4b73-4d78-8f2d-48aac3588095` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-85b9d76b-0df0-4933-b28c-5a84f0c217ef` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-daa222b8-9a21-4b10-b6f8-1db290dc84fa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6660b937-1ae0-4091-8643-5e487d86b91e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6660b937-1ae0-4091-8643-5e487d86b91e
Content-Type: application/json

--- request body ---
{"handle":"qa-0fcb5e7e4edc","displayName":"QA 0fcb5e7e4edc","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-6660b937-1ae0-4091-8643-5e487d86b91e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Location: /v1/accounts/qa-0fcb5e7e4edc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_09f674e7-d38d-466d-bc96-c943d0c46a8f","handle":"qa-0fcb5e7e4edc","displayName":"QA 0fcb5e7e4edc","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.707715851Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8af7f400-397e-4690-92b7-aa5fb15dd180

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8af7f400-397e-4690-92b7-aa5fb15dd180
Content-Type: application/json

--- request body ---
{"handle":"qa-49ab1c62d4df","displayName":"QA 49ab1c62d4df","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8af7f400-397e-4690-92b7-aa5fb15dd180
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Location: /v1/accounts/qa-49ab1c62d4df
X-Served-Region: eu
Content-Length: 181

{"id":"acc_41d6d6bb-82d9-47a3-8542-63cdff982de9","handle":"qa-49ab1c62d4df","displayName":"QA 49ab1c62d4df","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.742718690Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b11db429-6f16-4158-8788-df48830e954b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b11db429-6f16-4158-8788-df48830e954b
Content-Type: application/json

--- request body ---
{"handle":"qa-0fcb5e7e4edc","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b11db429-6f16-4158-8788-df48830e954b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_09f674e7-d38d-466d-bc96-c943d0c46a8f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ba2fef0e-a09d-4249-89cd-9f1078437f70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba2fef0e-a09d-4249-89cd-9f1078437f70
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-49ab1c62d4df","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba2fef0e-a09d-4249-89cd-9f1078437f70
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
Location: /v1/conversations/cnv_247712e0-e1e1-4126-97d2-26e896525f96
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_247712e0-e1e1-4126-97d2-26e896525f96","subject":"Error contract","status":"open","region":"eu","participants":["qa-0fcb5e7e4edc","qa-49ab1c62d4df"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.832800421Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-dc6dc261-9206-4bfa-afae-80193d3d7cb8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 86185ace-890f-4bf9-a453-a8107e02bc6a
X-Correlation-Id: qa-dc6dc261-9206-4bfa-afae-80193d3d7cb8
Content-Type: application/json

--- request body ---
{"handle":"qa-82b50d38388f","displayName":"QA 82b50d38388f","password":"****","region":"eu"}

--- response: 503 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc6dc261-9206-4bfa-afae-80193d3d7cb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-dc6dc261-9206-4bfa-afae-80193d3d7cb8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e219579f-5bf9-4aab-ba90-a11a702a7236

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e219579f-5bf9-4aab-ba90-a11a702a7236
Content-Type: application/json

--- request body ---
{"handle":"qa-49ab1c62d4df","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e219579f-5bf9-4aab-ba90-a11a702a7236
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_41d6d6bb-82d9-47a3-8542-63cdff982de9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4ee47684-ba51-40e2-803a-8bc4aa3917d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ee47684-ba51-40e2-803a-8bc4aa3917d7
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4ee47684-ba51-40e2-803a-8bc4aa3917d7
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
correlation: qa-4e4e74b9-4b73-4d78-8f2d-48aac3588095

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e4e74b9-4b73-4d78-8f2d-48aac3588095
Content-Type: application/json

--- request body ---
{"handle":"qa-49ab1c62d4df","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e4e74b9-4b73-4d78-8f2d-48aac3588095
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4e4e74b9-4b73-4d78-8f2d-48aac3588095"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-85b9d76b-0df0-4933-b28c-5a84f0c217ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85b9d76b-0df0-4933-b28c-5a84f0c217ef
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-85b9d76b-0df0-4933-b28c-5a84f0c217ef
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-daa222b8-9a21-4b10-b6f8-1db290dc84fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daa222b8-9a21-4b10-b6f8-1db290dc84fa
Content-Type: application/json

--- request body ---
{"handle":"qa-0fcb5e7e4edc","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-daa222b8-9a21-4b10-b6f8-1db290dc84fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-daa222b8-9a21-4b10-b6f8-1db290dc84fa"}
```
