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
| 1 | `POST /v1/accounts` | 201 | 662 | `qa-057203eb-db43-4cd7-98a5-a8d7d0e64d4c` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-461c6a87-6490-44fb-9dd0-a51cdfbd67a1` |
| 3 | `POST /v1/auth/token` | 200 | 88 | `qa-e39b7511-da8d-4139-8909-6eb8d75b8906` |
| 4 | `POST /v1/conversations` | 201 | 71 | `qa-3f64ba8b-5985-4424-b464-c24956405093` |
| 5 | `POST /v1/accounts` | 400 | 36 | `qa-73515d8c-52d7-41e5-89ba-299d057590b3` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-b227fc85-f659-40ec-9e2f-2b8f996662b7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 46 | `qa-da1dc1df-3bd4-48e3-893f-c3c00fc0a062` |
| 8 | `POST /v1/auth/token` | 401 | 48 | `qa-e89ffdab-025a-4929-af70-1e4f9fe05ac5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-6fe54042-8161-4f3e-8019-c99c9e8d84a9` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-62746909-07e2-4d1d-8950-5791b972d6f9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-057203eb-db43-4cd7-98a5-a8d7d0e64d4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-057203eb-db43-4cd7-98a5-a8d7d0e64d4c
Content-Type: application/json

--- request body ---
{"handle":"qa-e988acd9b106","displayName":"QA e988acd9b106","password":"****","region":"eu"}

--- response: 201 in 662 ms ---
Date: Sat, 31 Oct 2026 08:31:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-057203eb-db43-4cd7-98a5-a8d7d0e64d4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Location: /v1/accounts/qa-e988acd9b106
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bd1d15b4-baa0-4e79-b1ed-e63907bfd492","handle":"qa-e988acd9b106","displayName":"QA e988acd9b106","region":"eu","role":"user","createdAt":"2026-10-31T08:31:32.872710312Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-461c6a87-6490-44fb-9dd0-a51cdfbd67a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-461c6a87-6490-44fb-9dd0-a51cdfbd67a1
Content-Type: application/json

--- request body ---
{"handle":"qa-3071aa5e2e27","displayName":"QA 3071aa5e2e27","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-461c6a87-6490-44fb-9dd0-a51cdfbd67a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Location: /v1/accounts/qa-3071aa5e2e27
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d9eb9e8-a883-47cc-9e24-3d7dda5d334b","handle":"qa-3071aa5e2e27","displayName":"QA 3071aa5e2e27","region":"eu","role":"user","createdAt":"2026-10-31T08:31:33.273885524Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e39b7511-da8d-4139-8909-6eb8d75b8906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e39b7511-da8d-4139-8909-6eb8d75b8906
Content-Type: application/json

--- request body ---
{"handle":"qa-e988acd9b106","password":"****"}

--- response: 200 in 88 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e39b7511-da8d-4139-8909-6eb8d75b8906
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bd1d15b4-baa0-4e79-b1ed-e63907bfd492"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3f64ba8b-5985-4424-b464-c24956405093

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f64ba8b-5985-4424-b464-c24956405093
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3071aa5e2e27","subject":"Error contract","message":"Hi"}

--- response: 201 in 71 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f64ba8b-5985-4424-b464-c24956405093
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
Location: /v1/conversations/cnv_281a3066-af6e-4796-a41c-1283170d1751
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_281a3066-af6e-4796-a41c-1283170d1751","subject":"Error contract","status":"open","region":"eu","participants":["qa-e988acd9b106","qa-3071aa5e2e27"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:33.554070259Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-73515d8c-52d7-41e5-89ba-299d057590b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73515d8c-52d7-41e5-89ba-299d057590b3
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 36 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73515d8c-52d7-41e5-89ba-299d057590b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-73515d8c-52d7-41e5-89ba-299d057590b3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b227fc85-f659-40ec-9e2f-2b8f996662b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b227fc85-f659-40ec-9e2f-2b8f996662b7
Content-Type: application/json

--- request body ---
{"handle":"qa-3071aa5e2e27","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b227fc85-f659-40ec-9e2f-2b8f996662b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6d9eb9e8-a883-47cc-9e24-3d7dda5d334b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-da1dc1df-3bd4-48e3-893f-c3c00fc0a062

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da1dc1df-3bd4-48e3-893f-c3c00fc0a062
Content-Type: application/json

--- response: 204 in 46 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-da1dc1df-3bd4-48e3-893f-c3c00fc0a062
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
correlation: qa-e89ffdab-025a-4929-af70-1e4f9fe05ac5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e89ffdab-025a-4929-af70-1e4f9fe05ac5
Content-Type: application/json

--- request body ---
{"handle":"qa-3071aa5e2e27","password":"****"}

--- response: 401 in 48 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e89ffdab-025a-4929-af70-1e4f9fe05ac5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e89ffdab-025a-4929-af70-1e4f9fe05ac5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6fe54042-8161-4f3e-8019-c99c9e8d84a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fe54042-8161-4f3e-8019-c99c9e8d84a9
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6fe54042-8161-4f3e-8019-c99c9e8d84a9
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
correlation: qa-62746909-07e2-4d1d-8950-5791b972d6f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62746909-07e2-4d1d-8950-5791b972d6f9
Content-Type: application/json

--- request body ---
{"handle":"qa-e988acd9b106","password":"****"}

--- response: 401 in 27 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62746909-07e2-4d1d-8950-5791b972d6f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-62746909-07e2-4d1d-8950-5791b972d6f9"}
```
