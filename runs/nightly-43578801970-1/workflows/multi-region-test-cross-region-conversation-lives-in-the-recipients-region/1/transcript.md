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
| 1 | `POST /v1/accounts` | 201 | 344 | `qa-ecd7e4ed-e0a7-41d0-aaec-3a1202796219` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-42ba1f39-7333-41f8-b5ec-7f180ac2dd2d` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-af83ae71-c177-40d2-b2fe-632c07617294` |
| 4 | `POST /v1/conversations` | 201 | 48 | `qa-bf5e5e03-03f0-4ab4-bc57-63a4c5bdbdcc` |
| 5 | `GET /v1/conversations/{id}` | 200 | 27 | `qa-2da01f03-1229-4229-99f3-ccce10197ff1` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-a637a4ee-c319-4109-bbe3-33c989d5780e` |
| 7 | `GET /v1/conversations/{id}` | 200 | 13 | `qa-4c3f2159-5252-4618-9f5f-c0ecb364593f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-2e3f223a-8164-4d0e-9e64-ac1bd91b06c1` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-5ec2eb7a-fdcf-4785-a08d-6a029e7b9ab3` |
| 10 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-b3108376-043b-4221-a51d-6e387b526a31` |
| 11 | `POST /v1/auth/token` | 401 | 4 | `qa-4f4b986c-cdfa-4777-afa4-fea7e5569565` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ecd7e4ed-e0a7-41d0-aaec-3a1202796219

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecd7e4ed-e0a7-41d0-aaec-3a1202796219
Content-Type: application/json

--- request body ---
{"handle":"qa-5eda1f337252","displayName":"QA 5eda1f337252","password":"****","region":"in"}

--- response: 201 in 344 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecd7e4ed-e0a7-41d0-aaec-3a1202796219
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
Location: /v1/accounts/qa-5eda1f337252
X-Served-Region: in
Content-Length: 181

{"id":"acc_e67bcf32-9100-4e5e-9127-bf29d55f17f7","handle":"qa-5eda1f337252","displayName":"QA 5eda1f337252","region":"in","role":"user","createdAt":"2026-11-14T09:05:19.172785832Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-42ba1f39-7333-41f8-b5ec-7f180ac2dd2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42ba1f39-7333-41f8-b5ec-7f180ac2dd2d
Content-Type: application/json

--- request body ---
{"handle":"qa-a3ecc2f4df89","displayName":"QA a3ecc2f4df89","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-42ba1f39-7333-41f8-b5ec-7f180ac2dd2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-a3ecc2f4df89
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f2c0b834-cd64-4b11-9784-160e072fc8e0","handle":"qa-a3ecc2f4df89","displayName":"QA a3ecc2f4df89","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.537904582Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-af83ae71-c177-40d2-b2fe-632c07617294

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af83ae71-c177-40d2-b2fe-632c07617294
Content-Type: application/json

--- request body ---
{"handle":"qa-5eda1f337252","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-af83ae71-c177-40d2-b2fe-632c07617294
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e67bcf32-9100-4e5e-9127-bf29d55f17f7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bf5e5e03-03f0-4ab4-bc57-63a4c5bdbdcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf5e5e03-03f0-4ab4-bc57-63a4c5bdbdcc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a3ecc2f4df89","subject":"Across regions","message":"Namaste"}

--- response: 201 in 48 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf5e5e03-03f0-4ab4-bc57-63a4c5bdbdcc
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
Location: /v1/conversations/cnv_7c111087-1227-45fb-a041-96f3dbb74ecd
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7c111087-1227-45fb-a041-96f3dbb74ecd","subject":"Across regions","status":"open","region":"eu","participants":["qa-5eda1f337252","qa-a3ecc2f4df89"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:19.642605305Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_7c111087-1227-45fb-a041-96f3dbb74ecd
correlation: qa-2da01f03-1229-4229-99f3-ccce10197ff1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2da01f03-1229-4229-99f3-ccce10197ff1
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-2da01f03-1229-4229-99f3-ccce10197ff1
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

{"id":"cnv_7c111087-1227-45fb-a041-96f3dbb74ecd","subject":"Across regions","status":"open","region":"eu","participants":["qa-5eda1f337252","qa-a3ecc2f4df89"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:19.642605305Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a637a4ee-c319-4109-bbe3-33c989d5780e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a637a4ee-c319-4109-bbe3-33c989d5780e
Content-Type: application/json

--- request body ---
{"handle":"qa-a3ecc2f4df89","password":"****"}

--- response: 200 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-a637a4ee-c319-4109-bbe3-33c989d5780e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f2c0b834-cd64-4b11-9784-160e072fc8e0"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_7c111087-1227-45fb-a041-96f3dbb74ecd
correlation: qa-4c3f2159-5252-4618-9f5f-c0ecb364593f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c3f2159-5252-4618-9f5f-c0ecb364593f
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c3f2159-5252-4618-9f5f-c0ecb364593f
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

{"id":"cnv_7c111087-1227-45fb-a041-96f3dbb74ecd","subject":"Across regions","status":"open","region":"eu","participants":["qa-5eda1f337252","qa-a3ecc2f4df89"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-14T09:05:19.642605305Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e3f223a-8164-4d0e-9e64-ac1bd91b06c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e3f223a-8164-4d0e-9e64-ac1bd91b06c1
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e3f223a-8164-4d0e-9e64-ac1bd91b06c1
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
correlation: qa-5ec2eb7a-fdcf-4785-a08d-6a029e7b9ab3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ec2eb7a-fdcf-4785-a08d-6a029e7b9ab3
Content-Type: application/json

--- request body ---
{"handle":"qa-a3ecc2f4df89","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ec2eb7a-fdcf-4785-a08d-6a029e7b9ab3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5ec2eb7a-fdcf-4785-a08d-6a029e7b9ab3"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b3108376-043b-4221-a51d-6e387b526a31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3108376-043b-4221-a51d-6e387b526a31
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b3108376-043b-4221-a51d-6e387b526a31
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
correlation: qa-4f4b986c-cdfa-4777-afa4-fea7e5569565

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f4b986c-cdfa-4777-afa4-fea7e5569565
Content-Type: application/json

--- request body ---
{"handle":"qa-5eda1f337252","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f4b986c-cdfa-4777-afa4-fea7e5569565
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f4b986c-cdfa-4777-afa4-fea7e5569565"}
```
