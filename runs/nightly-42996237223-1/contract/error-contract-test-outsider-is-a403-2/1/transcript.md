# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 61 | `qa-6a574f75-16ae-4efe-87e5-479392116092` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-d8b73a3e-662f-46d3-9823-371cb366896c` |
| 3 | `POST /v1/accounts` | 201 | 36 | `qa-32857547-5159-4201-bd7c-6d955d340f89` |
| 4 | `POST /v1/auth/token` | 200 | 21 | `qa-7e9d0da9-0faa-4279-abbc-c3729c932f12` |
| 5 | `POST /v1/conversations` | 201 | 21 | `qa-8e67b941-c540-46da-8418-126fb5cbe4d1` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-0ec67cca-0230-46e3-9a5b-13f1ff1e9814` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 16 | `qa-b664cdcf-955e-4cd3-9ab7-d0fd5aeb4f4e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-e2acab2d-c795-40d8-a4f4-6a47f83c30f5` |
| 9 | `POST /v1/auth/token` | 401 | 33 | `qa-78b3474a-ec37-4a98-9ad7-7c2aafed5e70` |
| 10 | `POST /v1/auth/token` | 200 | 42 | `qa-b936a88f-1bf6-4dc3-8acc-ec268df55ca3` |
| 11 | `DELETE /v1/accounts/me` | 204 | 56 | `qa-354df7a1-68e1-4883-9e9c-b777fcc2dbf0` |
| 12 | `POST /v1/auth/token` | 401 | 22 | `qa-05283b38-83bd-4264-a265-628c0eb8748e` |
| 13 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-fd2be651-7bee-4451-b399-553ffb3d1c01` |
| 14 | `POST /v1/auth/token` | 401 | 48 | `qa-8c6a9322-398b-4363-8040-19e2146512fa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6a574f75-16ae-4efe-87e5-479392116092

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a574f75-16ae-4efe-87e5-479392116092
Content-Type: application/json

--- request body ---
{"handle":"qa-5dcca9b362ef","displayName":"QA 5dcca9b362ef","password":"****","region":"eu"}

--- response: 201 in 61 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a574f75-16ae-4efe-87e5-479392116092
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Location: /v1/accounts/qa-5dcca9b362ef
X-Served-Region: eu
Content-Length: 181

{"id":"acc_80cf6e6d-88d9-4467-b132-b4aecfa08ef8","handle":"qa-5dcca9b362ef","displayName":"QA 5dcca9b362ef","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.174965371Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d8b73a3e-662f-46d3-9823-371cb366896c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8b73a3e-662f-46d3-9823-371cb366896c
Content-Type: application/json

--- request body ---
{"handle":"qa-49c72c548f54","displayName":"QA 49c72c548f54","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8b73a3e-662f-46d3-9823-371cb366896c
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
Location: /v1/accounts/qa-49c72c548f54
X-Served-Region: eu
Content-Length: 181

{"id":"acc_628a32b1-c951-479b-80b3-a895efc49c20","handle":"qa-49c72c548f54","displayName":"QA 49c72c548f54","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.248419156Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-32857547-5159-4201-bd7c-6d955d340f89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32857547-5159-4201-bd7c-6d955d340f89
Content-Type: application/json

--- request body ---
{"handle":"qa-0dbc71ccaacc","displayName":"QA 0dbc71ccaacc","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-32857547-5159-4201-bd7c-6d955d340f89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Location: /v1/accounts/qa-0dbc71ccaacc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_15b3cf0e-c01a-41bd-94a8-1790087abe52","handle":"qa-0dbc71ccaacc","displayName":"QA 0dbc71ccaacc","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.300132855Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-7e9d0da9-0faa-4279-abbc-c3729c932f12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e9d0da9-0faa-4279-abbc-c3729c932f12
Content-Type: application/json

--- request body ---
{"handle":"qa-5dcca9b362ef","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e9d0da9-0faa-4279-abbc-c3729c932f12
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_80cf6e6d-88d9-4467-b132-b4aecfa08ef8"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-8e67b941-c540-46da-8418-126fb5cbe4d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e67b941-c540-46da-8418-126fb5cbe4d1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-49c72c548f54","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e67b941-c540-46da-8418-126fb5cbe4d1
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
Location: /v1/conversations/cnv_ec1ff9f1-759d-472e-9f7b-a4221a6b18b2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ec1ff9f1-759d-472e-9f7b-a4221a6b18b2","subject":"Error contract","status":"open","region":"eu","participants":["qa-5dcca9b362ef","qa-49c72c548f54"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:36.372071388Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0ec67cca-0230-46e3-9a5b-13f1ff1e9814

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ec67cca-0230-46e3-9a5b-13f1ff1e9814
Content-Type: application/json

--- request body ---
{"handle":"qa-0dbc71ccaacc","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ec67cca-0230-46e3-9a5b-13f1ff1e9814
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_15b3cf0e-c01a-41bd-94a8-1790087abe52"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_ec1ff9f1-759d-472e-9f7b-a4221a6b18b2/messages
correlation: qa-b664cdcf-955e-4cd3-9ab7-d0fd5aeb4f4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b664cdcf-955e-4cd3-9ab7-d0fd5aeb4f4e
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b664cdcf-955e-4cd3-9ab7-d0fd5aeb4f4e
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_ec1ff9f1-759d-472e-9f7b-a4221a6b18b2/messages","correlationId":"qa-b664cdcf-955e-4cd3-9ab7-d0fd5aeb4f4e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2acab2d-c795-40d8-a4f4-6a47f83c30f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2acab2d-c795-40d8-a4f4-6a47f83c30f5
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2acab2d-c795-40d8-a4f4-6a47f83c30f5
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
correlation: qa-78b3474a-ec37-4a98-9ad7-7c2aafed5e70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78b3474a-ec37-4a98-9ad7-7c2aafed5e70
Content-Type: application/json

--- request body ---
{"handle":"qa-0dbc71ccaacc","password":"****"}

--- response: 401 in 33 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78b3474a-ec37-4a98-9ad7-7c2aafed5e70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-78b3474a-ec37-4a98-9ad7-7c2aafed5e70"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b936a88f-1bf6-4dc3-8acc-ec268df55ca3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b936a88f-1bf6-4dc3-8acc-ec268df55ca3
Content-Type: application/json

--- request body ---
{"handle":"qa-49c72c548f54","password":"****"}

--- response: 200 in 42 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b936a88f-1bf6-4dc3-8acc-ec268df55ca3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_628a32b1-c951-479b-80b3-a895efc49c20"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-354df7a1-68e1-4883-9e9c-b777fcc2dbf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-354df7a1-68e1-4883-9e9c-b777fcc2dbf0
Content-Type: application/json

--- response: 204 in 56 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-354df7a1-68e1-4883-9e9c-b777fcc2dbf0
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
correlation: qa-05283b38-83bd-4264-a265-628c0eb8748e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05283b38-83bd-4264-a265-628c0eb8748e
Content-Type: application/json

--- request body ---
{"handle":"qa-49c72c548f54","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05283b38-83bd-4264-a265-628c0eb8748e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-05283b38-83bd-4264-a265-628c0eb8748e"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd2be651-7bee-4451-b399-553ffb3d1c01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd2be651-7bee-4451-b399-553ffb3d1c01
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd2be651-7bee-4451-b399-553ffb3d1c01
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
correlation: qa-8c6a9322-398b-4363-8040-19e2146512fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c6a9322-398b-4363-8040-19e2146512fa
Content-Type: application/json

--- request body ---
{"handle":"qa-5dcca9b362ef","password":"****"}

--- response: 401 in 48 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c6a9322-398b-4363-8040-19e2146512fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8c6a9322-398b-4363-8040-19e2146512fa"}
```
