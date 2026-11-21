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
| 1 | `POST /v1/accounts` | 201 | 282 | `qa-3ef20fd6-a609-4124-b491-8413fc5704c2` |
| 2 | `POST /v1/accounts` | 201 | 55 | `qa-6bc9d6df-d3f8-4f2e-82ee-b401d0e59646` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-95d48c3f-0531-43a8-8f2d-ce4493957e01` |
| 4 | `POST /v1/conversations` | 201 | 43 | `qa-adb6c2e2-79cf-4f71-b15a-dc16e0e8b3dd` |
| 5 | `GET /v1/conversations/{id}` | 200 | 30 | `qa-157ccd7a-8273-45df-8643-d5d2c62ec975` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-08db0a48-3965-445b-9831-b8f651968872` |
| 7 | `GET /v1/conversations/{id}` | 200 | 5 | `qa-111bdbb7-ec21-4f59-bf55-1427789ad939` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-20f791e2-9f62-497f-8d19-7acc413fa2df` |
| 9 | `POST /v1/auth/token` | 401 | 14 | `qa-9a6fcbca-4731-494c-bf7a-31c729c6e66e` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-fce919ce-4f49-41f4-b46a-628c19cfc990` |
| 11 | `POST /v1/auth/token` | 401 | 3 | `qa-71e6263e-a822-4713-af1e-cb70a5b131d8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3ef20fd6-a609-4124-b491-8413fc5704c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ef20fd6-a609-4124-b491-8413fc5704c2
Content-Type: application/json

--- request body ---
{"handle":"qa-7f83caa394d6","displayName":"QA 7f83caa394d6","password":"****","region":"in"}

--- response: 201 in 282 ms ---
Date: Wed, 18 Nov 2026 10:19:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ef20fd6-a609-4124-b491-8413fc5704c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-7f83caa394d6
X-Served-Region: in
Content-Length: 181

{"id":"acc_fb502d60-c330-458e-a811-f6edd64f027d","handle":"qa-7f83caa394d6","displayName":"QA 7f83caa394d6","region":"in","role":"user","createdAt":"2026-11-18T10:19:39.764534990Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6bc9d6df-d3f8-4f2e-82ee-b401d0e59646

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bc9d6df-d3f8-4f2e-82ee-b401d0e59646
Content-Type: application/json

--- request body ---
{"handle":"qa-534d43ad3f9b","displayName":"QA 534d43ad3f9b","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bc9d6df-d3f8-4f2e-82ee-b401d0e59646
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Location: /v1/accounts/qa-534d43ad3f9b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4f781df8-565e-4941-9420-97d7ca1295ca","handle":"qa-534d43ad3f9b","displayName":"QA 534d43ad3f9b","region":"eu","role":"user","createdAt":"2026-11-18T10:19:40.099902176Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-95d48c3f-0531-43a8-8f2d-ce4493957e01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95d48c3f-0531-43a8-8f2d-ce4493957e01
Content-Type: application/json

--- request body ---
{"handle":"qa-7f83caa394d6","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-95d48c3f-0531-43a8-8f2d-ce4493957e01
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fb502d60-c330-458e-a811-f6edd64f027d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-adb6c2e2-79cf-4f71-b15a-dc16e0e8b3dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adb6c2e2-79cf-4f71-b15a-dc16e0e8b3dd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-534d43ad3f9b","subject":"Across regions","message":"Namaste"}

--- response: 201 in 43 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-adb6c2e2-79cf-4f71-b15a-dc16e0e8b3dd
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
Location: /v1/conversations/cnv_129748af-5f4a-43b8-a918-63f065acf521
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_129748af-5f4a-43b8-a918-63f065acf521","subject":"Across regions","status":"open","region":"eu","participants":["qa-7f83caa394d6","qa-534d43ad3f9b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:40.170649403Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_129748af-5f4a-43b8-a918-63f065acf521
correlation: qa-157ccd7a-8273-45df-8643-d5d2c62ec975

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-157ccd7a-8273-45df-8643-d5d2c62ec975
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-157ccd7a-8273-45df-8643-d5d2c62ec975
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

{"id":"cnv_129748af-5f4a-43b8-a918-63f065acf521","subject":"Across regions","status":"open","region":"eu","participants":["qa-7f83caa394d6","qa-534d43ad3f9b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:40.170649403Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-08db0a48-3965-445b-9831-b8f651968872

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08db0a48-3965-445b-9831-b8f651968872
Content-Type: application/json

--- request body ---
{"handle":"qa-534d43ad3f9b","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-08db0a48-3965-445b-9831-b8f651968872
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4f781df8-565e-4941-9420-97d7ca1295ca"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_129748af-5f4a-43b8-a918-63f065acf521
correlation: qa-111bdbb7-ec21-4f59-bf55-1427789ad939

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-111bdbb7-ec21-4f59-bf55-1427789ad939
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/json
X-Correlation-Id: qa-111bdbb7-ec21-4f59-bf55-1427789ad939
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

{"id":"cnv_129748af-5f4a-43b8-a918-63f065acf521","subject":"Across regions","status":"open","region":"eu","participants":["qa-7f83caa394d6","qa-534d43ad3f9b"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-18T10:19:40.170649403Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-20f791e2-9f62-497f-8d19-7acc413fa2df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20f791e2-9f62-497f-8d19-7acc413fa2df
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-20f791e2-9f62-497f-8d19-7acc413fa2df
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
correlation: qa-9a6fcbca-4731-494c-bf7a-31c729c6e66e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a6fcbca-4731-494c-bf7a-31c729c6e66e
Content-Type: application/json

--- request body ---
{"handle":"qa-534d43ad3f9b","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a6fcbca-4731-494c-bf7a-31c729c6e66e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9a6fcbca-4731-494c-bf7a-31c729c6e66e"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fce919ce-4f49-41f4-b46a-628c19cfc990

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fce919ce-4f49-41f4-b46a-628c19cfc990
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fce919ce-4f49-41f4-b46a-628c19cfc990
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
correlation: qa-71e6263e-a822-4713-af1e-cb70a5b131d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71e6263e-a822-4713-af1e-cb70a5b131d8
Content-Type: application/json

--- request body ---
{"handle":"qa-7f83caa394d6","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71e6263e-a822-4713-af1e-cb70a5b131d8
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71e6263e-a822-4713-af1e-cb70a5b131d8"}
```
