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
| 1 | `POST /v1/accounts` | 201 | 502 | `qa-fa784e3e-ba91-4f84-afd7-bb4d54b39ddc` |
| 2 | `POST /v1/accounts` | 201 | 93 | `qa-39bae535-7ff7-4ff7-9cc3-d2fbd117ea59` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-2405d767-a4dd-405b-9e80-7d13e0f287ee` |
| 4 | `POST /v1/conversations` | 201 | 126 | `qa-10a07c4a-432b-4341-9593-9222a10a6038` |
| 5 | `GET /v1/conversations/{id}` | 200 | 48 | `qa-b86c79c6-0e51-4ed3-8245-5761ca9418dd` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-77111678-8fec-4908-bcc1-f87834fcdef0` |
| 7 | `GET /v1/conversations/{id}` | 200 | 16 | `qa-57a66c8e-9b34-4e32-80e7-eb7f380fd8bd` |
| 8 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-c7406c06-4b3f-4fc5-8983-e031e49f6647` |
| 9 | `POST /v1/auth/token` | 401 | 12 | `qa-1f362107-c6f4-42d1-a040-e40ae1287c14` |
| 10 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-ddbc1697-5f3f-4852-8906-bfe41cb0ca0d` |
| 11 | `POST /v1/auth/token` | 401 | 22 | `qa-f7e70127-b466-47ab-a3c6-d7ddfe64496a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fa784e3e-ba91-4f84-afd7-bb4d54b39ddc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa784e3e-ba91-4f84-afd7-bb4d54b39ddc
Content-Type: application/json

--- request body ---
{"handle":"qa-5eba69eb41f0","displayName":"QA 5eba69eb41f0","password":"****","region":"in"}

--- response: 201 in 502 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa784e3e-ba91-4f84-afd7-bb4d54b39ddc
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
Location: /v1/accounts/qa-5eba69eb41f0
X-Served-Region: in
Content-Length: 181

{"id":"acc_ff133f6c-7295-44ca-a1fb-f720038f57d7","handle":"qa-5eba69eb41f0","displayName":"QA 5eba69eb41f0","region":"in","role":"user","createdAt":"2026-11-04T09:28:13.964447518Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-39bae535-7ff7-4ff7-9cc3-d2fbd117ea59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39bae535-7ff7-4ff7-9cc3-d2fbd117ea59
Content-Type: application/json

--- request body ---
{"handle":"qa-7725d4131c56","displayName":"QA 7725d4131c56","password":"****","region":"eu"}

--- response: 201 in 93 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-39bae535-7ff7-4ff7-9cc3-d2fbd117ea59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-7725d4131c56
X-Served-Region: eu
Content-Length: 181

{"id":"acc_62bef124-b98a-4ea8-93e0-78661f7ff403","handle":"qa-7725d4131c56","displayName":"QA 7725d4131c56","region":"eu","role":"user","createdAt":"2026-11-04T09:28:14.478283598Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2405d767-a4dd-405b-9e80-7d13e0f287ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2405d767-a4dd-405b-9e80-7d13e0f287ee
Content-Type: application/json

--- request body ---
{"handle":"qa-5eba69eb41f0","password":"****"}

--- response: 200 in 35 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-2405d767-a4dd-405b-9e80-7d13e0f287ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ff133f6c-7295-44ca-a1fb-f720038f57d7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-10a07c4a-432b-4341-9593-9222a10a6038

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10a07c4a-432b-4341-9593-9222a10a6038
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7725d4131c56","subject":"Across regions","message":"Namaste"}

--- response: 201 in 126 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-10a07c4a-432b-4341-9593-9222a10a6038
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
Location: /v1/conversations/cnv_f02d7e00-cc8b-4727-bebb-d6bc66212b8a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f02d7e00-cc8b-4727-bebb-d6bc66212b8a","subject":"Across regions","status":"open","region":"eu","participants":["qa-5eba69eb41f0","qa-7725d4131c56"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:14.713188831Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_f02d7e00-cc8b-4727-bebb-d6bc66212b8a
correlation: qa-b86c79c6-0e51-4ed3-8245-5761ca9418dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b86c79c6-0e51-4ed3-8245-5761ca9418dd
Content-Type: application/json

--- response: 200 in 48 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-b86c79c6-0e51-4ed3-8245-5761ca9418dd
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

{"id":"cnv_f02d7e00-cc8b-4727-bebb-d6bc66212b8a","subject":"Across regions","status":"open","region":"eu","participants":["qa-5eba69eb41f0","qa-7725d4131c56"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:14.713188831Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-77111678-8fec-4908-bcc1-f87834fcdef0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77111678-8fec-4908-bcc1-f87834fcdef0
Content-Type: application/json

--- request body ---
{"handle":"qa-7725d4131c56","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-77111678-8fec-4908-bcc1-f87834fcdef0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_62bef124-b98a-4ea8-93e0-78661f7ff403"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_f02d7e00-cc8b-4727-bebb-d6bc66212b8a
correlation: qa-57a66c8e-9b34-4e32-80e7-eb7f380fd8bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57a66c8e-9b34-4e32-80e7-eb7f380fd8bd
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-57a66c8e-9b34-4e32-80e7-eb7f380fd8bd
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

{"id":"cnv_f02d7e00-cc8b-4727-bebb-d6bc66212b8a","subject":"Across regions","status":"open","region":"eu","participants":["qa-5eba69eb41f0","qa-7725d4131c56"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-04T09:28:14.713188831Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c7406c06-4b3f-4fc5-8983-e031e49f6647

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7406c06-4b3f-4fc5-8983-e031e49f6647
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c7406c06-4b3f-4fc5-8983-e031e49f6647
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
correlation: qa-1f362107-c6f4-42d1-a040-e40ae1287c14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f362107-c6f4-42d1-a040-e40ae1287c14
Content-Type: application/json

--- request body ---
{"handle":"qa-7725d4131c56","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f362107-c6f4-42d1-a040-e40ae1287c14
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f362107-c6f4-42d1-a040-e40ae1287c14"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ddbc1697-5f3f-4852-8906-bfe41cb0ca0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddbc1697-5f3f-4852-8906-bfe41cb0ca0d
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ddbc1697-5f3f-4852-8906-bfe41cb0ca0d
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
correlation: qa-f7e70127-b466-47ab-a3c6-d7ddfe64496a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7e70127-b466-47ab-a3c6-d7ddfe64496a
Content-Type: application/json

--- request body ---
{"handle":"qa-5eba69eb41f0","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 04 Nov 2026 09:28:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7e70127-b466-47ab-a3c6-d7ddfe64496a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f7e70127-b466-47ab-a3c6-d7ddfe64496a"}
```
