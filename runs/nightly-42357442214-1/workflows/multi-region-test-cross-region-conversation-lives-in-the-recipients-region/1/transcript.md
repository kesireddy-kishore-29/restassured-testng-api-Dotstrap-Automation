# Transcript: A cross-region conversation is stored in the recipient's region, for both sides

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#crossRegionConversationLivesInTheRecipientsRegion` |
| Features | FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 398 | `qa-24974729-45c5-49f0-887f-6ab4792b081d` |
| 2 | `POST /v1/accounts` | 201 | 78 | `qa-8aecd8c3-3406-4e10-86bf-7b9b07274a69` |
| 3 | `POST /v1/auth/token` | 200 | 68 | `qa-cc228460-0c00-4f65-9a7a-48169169ae70` |
| 4 | `POST /v1/conversations` | 201 | 121 | `qa-6cd6d78d-87ea-420a-8a3d-8da2938c6c80` |
| 5 | `GET /v1/conversations/{id}` | 200 | 37 | `qa-63ddad1b-531f-4b33-b3b0-1a78ddaf3805` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-3e7b38d9-8e49-4730-83c4-3b41b5d6258f` |
| 7 | `GET /v1/conversations/{id}` | 200 | 18 | `qa-410bc718-f067-47b5-8e1b-863e105e2f5c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-a5acf2a7-4838-472b-b952-4d481982fce5` |
| 9 | `POST /v1/auth/token` | 401 | 36 | `qa-ce0f339a-5d14-40f4-aaf2-2ac078310dd2` |
| 10 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-ce7bab4f-6462-41bb-a46c-3ae33c19b34a` |
| 11 | `POST /v1/auth/token` | 401 | 20 | `qa-836d6cba-dd91-4b0d-acac-66ed7133e156` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-24974729-45c5-49f0-887f-6ab4792b081d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24974729-45c5-49f0-887f-6ab4792b081d
Content-Type: application/json

--- request body ---
{"handle":"qa-d40a5399ac4f","displayName":"QA d40a5399ac4f","password":"****","region":"in"}

--- response: 201 in 398 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-24974729-45c5-49f0-887f-6ab4792b081d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-d40a5399ac4f
X-Served-Region: in
Content-Length: 181

{"id":"acc_e289a922-9974-483a-b309-c0e2132ae321","handle":"qa-d40a5399ac4f","displayName":"QA d40a5399ac4f","region":"in","role":"user","createdAt":"2026-11-07T08:55:03.097199454Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8aecd8c3-3406-4e10-86bf-7b9b07274a69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8aecd8c3-3406-4e10-86bf-7b9b07274a69
Content-Type: application/json

--- request body ---
{"handle":"qa-2a333f8fbd59","displayName":"QA 2a333f8fbd59","password":"****","region":"eu"}

--- response: 201 in 78 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8aecd8c3-3406-4e10-86bf-7b9b07274a69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-2a333f8fbd59
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dd8b012b-4b7f-4b65-9214-885375b7816f","handle":"qa-2a333f8fbd59","displayName":"QA 2a333f8fbd59","region":"eu","role":"user","createdAt":"2026-11-07T08:55:03.542529756Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cc228460-0c00-4f65-9a7a-48169169ae70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc228460-0c00-4f65-9a7a-48169169ae70
Content-Type: application/json

--- request body ---
{"handle":"qa-d40a5399ac4f","password":"****"}

--- response: 200 in 68 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc228460-0c00-4f65-9a7a-48169169ae70
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e289a922-9974-483a-b309-c0e2132ae321"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6cd6d78d-87ea-420a-8a3d-8da2938c6c80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cd6d78d-87ea-420a-8a3d-8da2938c6c80
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2a333f8fbd59","subject":"Across regions","message":"Namaste"}

--- response: 201 in 121 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cd6d78d-87ea-420a-8a3d-8da2938c6c80
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
X-Served-Region: in
Location: /v1/conversations/cnv_96f3df7c-0a6e-4b8c-b09e-54ad3f0c85f7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_96f3df7c-0a6e-4b8c-b09e-54ad3f0c85f7","subject":"Across regions","status":"open","region":"eu","participants":["qa-d40a5399ac4f","qa-2a333f8fbd59"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:55:03.787010621Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_96f3df7c-0a6e-4b8c-b09e-54ad3f0c85f7
correlation: qa-63ddad1b-531f-4b33-b3b0-1a78ddaf3805

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63ddad1b-531f-4b33-b3b0-1a78ddaf3805
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-63ddad1b-531f-4b33-b3b0-1a78ddaf3805
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
X-Served-Region: in
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_96f3df7c-0a6e-4b8c-b09e-54ad3f0c85f7","subject":"Across regions","status":"open","region":"eu","participants":["qa-d40a5399ac4f","qa-2a333f8fbd59"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:55:03.787010621Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3e7b38d9-8e49-4730-83c4-3b41b5d6258f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e7b38d9-8e49-4730-83c4-3b41b5d6258f
Content-Type: application/json

--- request body ---
{"handle":"qa-2a333f8fbd59","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e7b38d9-8e49-4730-83c4-3b41b5d6258f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dd8b012b-4b7f-4b65-9214-885375b7816f"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_96f3df7c-0a6e-4b8c-b09e-54ad3f0c85f7
correlation: qa-410bc718-f067-47b5-8e1b-863e105e2f5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-410bc718-f067-47b5-8e1b-863e105e2f5c
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-410bc718-f067-47b5-8e1b-863e105e2f5c
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_96f3df7c-0a6e-4b8c-b09e-54ad3f0c85f7","subject":"Across regions","status":"open","region":"eu","participants":["qa-d40a5399ac4f","qa-2a333f8fbd59"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-07T08:55:03.787010621Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a5acf2a7-4838-472b-b952-4d481982fce5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5acf2a7-4838-472b-b952-4d481982fce5
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a5acf2a7-4838-472b-b952-4d481982fce5
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
correlation: qa-ce0f339a-5d14-40f4-aaf2-2ac078310dd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce0f339a-5d14-40f4-aaf2-2ac078310dd2
Content-Type: application/json

--- request body ---
{"handle":"qa-2a333f8fbd59","password":"****"}

--- response: 401 in 36 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce0f339a-5d14-40f4-aaf2-2ac078310dd2
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce0f339a-5d14-40f4-aaf2-2ac078310dd2"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce7bab4f-6462-41bb-a46c-3ae33c19b34a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce7bab4f-6462-41bb-a46c-3ae33c19b34a
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce7bab4f-6462-41bb-a46c-3ae33c19b34a
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
X-Served-Region: in
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-836d6cba-dd91-4b0d-acac-66ed7133e156

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-836d6cba-dd91-4b0d-acac-66ed7133e156
Content-Type: application/json

--- request body ---
{"handle":"qa-d40a5399ac4f","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-836d6cba-dd91-4b0d-acac-66ed7133e156
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-836d6cba-dd91-4b0d-acac-66ed7133e156"}
```
