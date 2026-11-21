# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-1fb6b8a6-078d-4e3d-b794-f2ccfcb1a6c0` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-7a8e7361-4a8b-4d88-b3a4-64297d462000` |
| 3 | `POST /v1/accounts` | 201 | 15 | `qa-64aadc57-873a-40b2-857a-81871236d248` |
| 4 | `POST /v1/auth/token` | 200 | 21 | `qa-7d204647-6547-4a3a-959b-eb974b034a34` |
| 5 | `POST /v1/conversations` | 201 | 18 | `qa-ee7819ab-9661-4653-b2c1-4cd1743ac87c` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-c8058498-f9b4-4375-b681-4e4746488b91` |
| 7 | `GET /v1/conversations/{id}` | 403 | 8 | `qa-004ab7bc-3296-4e2b-8a77-b16871f4fa4a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-32ebb832-fca9-49b9-8820-a99b732fc325` |
| 9 | `POST /v1/auth/token` | 401 | 19 | `qa-d2b871a4-a853-45e9-8fb4-f52246a379e8` |
| 10 | `POST /v1/auth/token` | 200 | 14 | `qa-c4d42c1b-baf3-4a33-a354-47b265215037` |
| 11 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-fff39f27-adde-45b2-9978-c7cbfca2da92` |
| 12 | `POST /v1/auth/token` | 401 | 13 | `qa-fa684185-d64d-44c7-890a-6f14dc66465a` |
| 13 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-1bd00bb7-e3ca-4bba-8814-b752d7548a15` |
| 14 | `POST /v1/auth/token` | 401 | 23 | `qa-11c028ac-d405-4e9b-8fb3-0c84cc926679` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1fb6b8a6-078d-4e3d-b794-f2ccfcb1a6c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fb6b8a6-078d-4e3d-b794-f2ccfcb1a6c0
Content-Type: application/json

--- request body ---
{"handle":"qa-f0d708501d25","displayName":"QA f0d708501d25","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fb6b8a6-078d-4e3d-b794-f2ccfcb1a6c0
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
Location: /v1/accounts/qa-f0d708501d25
X-Served-Region: eu
Content-Length: 181

{"id":"acc_362c0105-da65-4fca-8076-57604894a68f","handle":"qa-f0d708501d25","displayName":"QA f0d708501d25","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.258291597Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7a8e7361-4a8b-4d88-b3a4-64297d462000

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a8e7361-4a8b-4d88-b3a4-64297d462000
Content-Type: application/json

--- request body ---
{"handle":"qa-30bbe971c245","displayName":"QA 30bbe971c245","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a8e7361-4a8b-4d88-b3a4-64297d462000
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-30bbe971c245
X-Served-Region: eu
Content-Length: 181

{"id":"acc_43ed86a6-3a88-48fa-b7d2-801ae16cbbfe","handle":"qa-30bbe971c245","displayName":"QA 30bbe971c245","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.293376650Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-64aadc57-873a-40b2-857a-81871236d248

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64aadc57-873a-40b2-857a-81871236d248
Content-Type: application/json

--- request body ---
{"handle":"qa-a934cedf030b","displayName":"QA a934cedf030b","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-64aadc57-873a-40b2-857a-81871236d248
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Location: /v1/accounts/qa-a934cedf030b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b2c1474a-aea2-4cd3-8837-c5025334f3f7","handle":"qa-a934cedf030b","displayName":"QA a934cedf030b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.317188678Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-7d204647-6547-4a3a-959b-eb974b034a34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d204647-6547-4a3a-959b-eb974b034a34
Content-Type: application/json

--- request body ---
{"handle":"qa-f0d708501d25","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d204647-6547-4a3a-959b-eb974b034a34
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_362c0105-da65-4fca-8076-57604894a68f"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ee7819ab-9661-4653-b2c1-4cd1743ac87c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee7819ab-9661-4653-b2c1-4cd1743ac87c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-30bbe971c245","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee7819ab-9661-4653-b2c1-4cd1743ac87c
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
Location: /v1/conversations/cnv_2c4d7e08-fdd8-49f2-8c73-92b846aa0b77
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2c4d7e08-fdd8-49f2-8c73-92b846aa0b77","subject":"Error contract","status":"open","region":"eu","participants":["qa-f0d708501d25","qa-30bbe971c245"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:08.394236497Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c8058498-f9b4-4375-b681-4e4746488b91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8058498-f9b4-4375-b681-4e4746488b91
Content-Type: application/json

--- request body ---
{"handle":"qa-a934cedf030b","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8058498-f9b4-4375-b681-4e4746488b91
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b2c1474a-aea2-4cd3-8837-c5025334f3f7"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_2c4d7e08-fdd8-49f2-8c73-92b846aa0b77
correlation: qa-004ab7bc-3296-4e2b-8a77-b16871f4fa4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-004ab7bc-3296-4e2b-8a77-b16871f4fa4a
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-004ab7bc-3296-4e2b-8a77-b16871f4fa4a
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_2c4d7e08-fdd8-49f2-8c73-92b846aa0b77","correlationId":"qa-004ab7bc-3296-4e2b-8a77-b16871f4fa4a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-32ebb832-fca9-49b9-8820-a99b732fc325

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32ebb832-fca9-49b9-8820-a99b732fc325
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-32ebb832-fca9-49b9-8820-a99b732fc325
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
correlation: qa-d2b871a4-a853-45e9-8fb4-f52246a379e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2b871a4-a853-45e9-8fb4-f52246a379e8
Content-Type: application/json

--- request body ---
{"handle":"qa-a934cedf030b","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2b871a4-a853-45e9-8fb4-f52246a379e8
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d2b871a4-a853-45e9-8fb4-f52246a379e8"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c4d42c1b-baf3-4a33-a354-47b265215037

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4d42c1b-baf3-4a33-a354-47b265215037
Content-Type: application/json

--- request body ---
{"handle":"qa-30bbe971c245","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4d42c1b-baf3-4a33-a354-47b265215037
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_43ed86a6-3a88-48fa-b7d2-801ae16cbbfe"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fff39f27-adde-45b2-9978-c7cbfca2da92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fff39f27-adde-45b2-9978-c7cbfca2da92
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fff39f27-adde-45b2-9978-c7cbfca2da92
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
correlation: qa-fa684185-d64d-44c7-890a-6f14dc66465a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa684185-d64d-44c7-890a-6f14dc66465a
Content-Type: application/json

--- request body ---
{"handle":"qa-30bbe971c245","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa684185-d64d-44c7-890a-6f14dc66465a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fa684185-d64d-44c7-890a-6f14dc66465a"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1bd00bb7-e3ca-4bba-8814-b752d7548a15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bd00bb7-e3ca-4bba-8814-b752d7548a15
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1bd00bb7-e3ca-4bba-8814-b752d7548a15
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
correlation: qa-11c028ac-d405-4e9b-8fb3-0c84cc926679

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11c028ac-d405-4e9b-8fb3-0c84cc926679
Content-Type: application/json

--- request body ---
{"handle":"qa-f0d708501d25","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11c028ac-d405-4e9b-8fb3-0c84cc926679
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-11c028ac-d405-4e9b-8fb3-0c84cc926679"}
```
