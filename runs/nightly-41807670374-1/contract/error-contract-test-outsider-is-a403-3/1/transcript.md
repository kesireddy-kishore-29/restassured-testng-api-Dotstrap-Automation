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
| 1 | `POST /v1/accounts` | 201 | 454 | `qa-cc49aefe-93e0-4536-9386-09e261e96304` |
| 2 | `POST /v1/accounts` | 201 | 62 | `qa-92fabce5-56d6-4da7-af07-01c85702db50` |
| 3 | `POST /v1/accounts` | 201 | 23 | `qa-5402c9ec-9c6f-4ae3-9dc2-8b57206643d3` |
| 4 | `POST /v1/auth/token` | 200 | 16 | `qa-73663d50-1d02-40c2-a28b-c01bba495474` |
| 5 | `POST /v1/conversations` | 201 | 40 | `qa-71db1be1-456d-4adf-8d62-b706cb958658` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-1e695e7a-9c99-44da-9502-063a8d8e11d9` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 10 | `qa-0aa25648-905a-4200-a5a1-a6d4c155f2a5` |
| 8 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-c4095c3c-b3bb-4d1b-95f0-baa3c94b4dfa` |
| 9 | `POST /v1/auth/token` | 401 | 19 | `qa-5491c3b5-aa0e-4d90-b6f8-e6a89c7a59a2` |
| 10 | `POST /v1/auth/token` | 200 | 43 | `qa-8fb834c7-e68a-4c89-a7f3-8e080a54b62c` |
| 11 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-b41fc272-6c1d-40ab-9a60-e477d13276fb` |
| 12 | `POST /v1/auth/token` | 401 | 12 | `qa-73700d50-52ba-4a01-b2d2-6bba889aa6ff` |
| 13 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-b19405ef-815e-46e2-85f2-023be8f42d59` |
| 14 | `POST /v1/auth/token` | 401 | 3 | `qa-2454f9d0-50ad-4be6-b33d-1275056325f4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cc49aefe-93e0-4536-9386-09e261e96304

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc49aefe-93e0-4536-9386-09e261e96304
Content-Type: application/json

--- request body ---
{"handle":"qa-07957de16968","displayName":"QA 07957de16968","password":"****","region":"eu"}

--- response: 201 in 454 ms ---
Date: Wed, 04 Nov 2026 09:28:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc49aefe-93e0-4536-9386-09e261e96304
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
Location: /v1/accounts/qa-07957de16968
X-Served-Region: eu
Content-Length: 181

{"id":"acc_03ba8bb0-f27f-4ee0-af4a-05a6aaac73f3","handle":"qa-07957de16968","displayName":"QA 07957de16968","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.097008035Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-92fabce5-56d6-4da7-af07-01c85702db50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92fabce5-56d6-4da7-af07-01c85702db50
Content-Type: application/json

--- request body ---
{"handle":"qa-be7f4c64b662","displayName":"QA be7f4c64b662","password":"****","region":"eu"}

--- response: 201 in 62 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-92fabce5-56d6-4da7-af07-01c85702db50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-be7f4c64b662
X-Served-Region: eu
Content-Length: 181

{"id":"acc_75735b8a-e4b6-48be-a46f-3ccf1f1c3fca","handle":"qa-be7f4c64b662","displayName":"QA be7f4c64b662","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.408660901Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-5402c9ec-9c6f-4ae3-9dc2-8b57206643d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5402c9ec-9c6f-4ae3-9dc2-8b57206643d3
Content-Type: application/json

--- request body ---
{"handle":"qa-bafe8b5074df","displayName":"QA bafe8b5074df","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5402c9ec-9c6f-4ae3-9dc2-8b57206643d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Location: /v1/accounts/qa-bafe8b5074df
X-Served-Region: eu
Content-Length: 181

{"id":"acc_96349702-4b77-404d-8b27-b2c678db61c8","handle":"qa-bafe8b5074df","displayName":"QA bafe8b5074df","region":"eu","role":"user","createdAt":"2026-11-04T09:28:01.460504981Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-73663d50-1d02-40c2-a28b-c01bba495474

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73663d50-1d02-40c2-a28b-c01bba495474
Content-Type: application/json

--- request body ---
{"handle":"qa-07957de16968","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-73663d50-1d02-40c2-a28b-c01bba495474
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_03ba8bb0-f27f-4ee0-af4a-05a6aaac73f3"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-71db1be1-456d-4adf-8d62-b706cb958658

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71db1be1-456d-4adf-8d62-b706cb958658
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-be7f4c64b662","subject":"Error contract","message":"Hi"}

--- response: 201 in 40 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-71db1be1-456d-4adf-8d62-b706cb958658
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
Location: /v1/conversations/cnv_78be5892-d3ab-4fad-9d23-31b334dcd8f0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_78be5892-d3ab-4fad-9d23-31b334dcd8f0","subject":"Error contract","status":"open","region":"eu","participants":["qa-07957de16968","qa-be7f4c64b662"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:01.526737093Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1e695e7a-9c99-44da-9502-063a8d8e11d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e695e7a-9c99-44da-9502-063a8d8e11d9
Content-Type: application/json

--- request body ---
{"handle":"qa-bafe8b5074df","password":"****"}

--- response: 200 in 38 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e695e7a-9c99-44da-9502-063a8d8e11d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96349702-4b77-404d-8b27-b2c678db61c8"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_78be5892-d3ab-4fad-9d23-31b334dcd8f0/read
correlation: qa-0aa25648-905a-4200-a5a1-a6d4c155f2a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0aa25648-905a-4200-a5a1-a6d4c155f2a5
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0aa25648-905a-4200-a5a1-a6d4c155f2a5
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_78be5892-d3ab-4fad-9d23-31b334dcd8f0/read","correlationId":"qa-0aa25648-905a-4200-a5a1-a6d4c155f2a5"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c4095c3c-b3bb-4d1b-95f0-baa3c94b4dfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4095c3c-b3bb-4d1b-95f0-baa3c94b4dfa
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c4095c3c-b3bb-4d1b-95f0-baa3c94b4dfa
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
correlation: qa-5491c3b5-aa0e-4d90-b6f8-e6a89c7a59a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5491c3b5-aa0e-4d90-b6f8-e6a89c7a59a2
Content-Type: application/json

--- request body ---
{"handle":"qa-bafe8b5074df","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5491c3b5-aa0e-4d90-b6f8-e6a89c7a59a2
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5491c3b5-aa0e-4d90-b6f8-e6a89c7a59a2"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8fb834c7-e68a-4c89-a7f3-8e080a54b62c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fb834c7-e68a-4c89-a7f3-8e080a54b62c
Content-Type: application/json

--- request body ---
{"handle":"qa-be7f4c64b662","password":"****"}

--- response: 200 in 43 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fb834c7-e68a-4c89-a7f3-8e080a54b62c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_75735b8a-e4b6-48be-a46f-3ccf1f1c3fca"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b41fc272-6c1d-40ab-9a60-e477d13276fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b41fc272-6c1d-40ab-9a60-e477d13276fb
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b41fc272-6c1d-40ab-9a60-e477d13276fb
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
correlation: qa-73700d50-52ba-4a01-b2d2-6bba889aa6ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73700d50-52ba-4a01-b2d2-6bba889aa6ff
Content-Type: application/json

--- request body ---
{"handle":"qa-be7f4c64b662","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73700d50-52ba-4a01-b2d2-6bba889aa6ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-73700d50-52ba-4a01-b2d2-6bba889aa6ff"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b19405ef-815e-46e2-85f2-023be8f42d59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b19405ef-815e-46e2-85f2-023be8f42d59
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b19405ef-815e-46e2-85f2-023be8f42d59
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
correlation: qa-2454f9d0-50ad-4be6-b33d-1275056325f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2454f9d0-50ad-4be6-b33d-1275056325f4
Content-Type: application/json

--- request body ---
{"handle":"qa-07957de16968","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2454f9d0-50ad-4be6-b33d-1275056325f4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2454f9d0-50ad-4be6-b33d-1275056325f4"}
```
