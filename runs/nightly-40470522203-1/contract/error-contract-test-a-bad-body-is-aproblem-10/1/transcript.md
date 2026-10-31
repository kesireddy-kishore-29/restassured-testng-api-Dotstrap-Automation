# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-6b1683ac-8716-456e-9ab5-ebb891e1723d` |
| 2 | `POST /v1/accounts` | 201 | 66 | `qa-786e9984-c895-4920-a549-70b37db5890c` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-37b4827a-5d73-4df6-9da6-3d0b2015bbda` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-37529fc7-0a0a-47a1-962f-0489e906d6a2` |
| 5 | `POST /v1/conversations` | 415 | 15 | `qa-a7472153-3dd1-409a-a6f2-c58ae3f8030d` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-fdb333b1-2b2f-4f6a-b11d-f2902c2313b0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-d0febdd1-9ec7-4e77-b00d-2016e4a2030c` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-cc23ded2-2b9d-4aa8-a61f-b8a817b455c1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-0c03df48-a96c-4ff4-996c-10511bf2783c` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-3dd8eb04-ae43-4517-b06f-f1719bcfd105` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6b1683ac-8716-456e-9ab5-ebb891e1723d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b1683ac-8716-456e-9ab5-ebb891e1723d
Content-Type: application/json

--- request body ---
{"handle":"qa-70f484ad014b","displayName":"QA 70f484ad014b","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b1683ac-8716-456e-9ab5-ebb891e1723d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 7
Location: /v1/accounts/qa-70f484ad014b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b63c1b42-fcd1-45b3-a555-ddc902db8424","handle":"qa-70f484ad014b","displayName":"QA 70f484ad014b","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.866747432Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-786e9984-c895-4920-a549-70b37db5890c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-786e9984-c895-4920-a549-70b37db5890c
Content-Type: application/json

--- request body ---
{"handle":"qa-b08b179f5e44","displayName":"QA b08b179f5e44","password":"****","region":"eu"}

--- response: 201 in 66 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-786e9984-c895-4920-a549-70b37db5890c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 7
Location: /v1/accounts/qa-b08b179f5e44
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9fe33675-8f38-4cc9-8ea3-767ef723573e","handle":"qa-b08b179f5e44","displayName":"QA b08b179f5e44","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.921918631Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-37b4827a-5d73-4df6-9da6-3d0b2015bbda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37b4827a-5d73-4df6-9da6-3d0b2015bbda
Content-Type: application/json

--- request body ---
{"handle":"qa-70f484ad014b","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-37b4827a-5d73-4df6-9da6-3d0b2015bbda
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b63c1b42-fcd1-45b3-a555-ddc902db8424"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-37529fc7-0a0a-47a1-962f-0489e906d6a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37529fc7-0a0a-47a1-962f-0489e906d6a2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b08b179f5e44","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-37529fc7-0a0a-47a1-962f-0489e906d6a2
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
Location: /v1/conversations/cnv_25b24fc2-4307-400f-9082-6bbe30060433
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_25b24fc2-4307-400f-9082-6bbe30060433","subject":"Error contract","status":"open","region":"eu","participants":["qa-70f484ad014b","qa-b08b179f5e44"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:35.020935772Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a7472153-3dd1-409a-a6f2-c58ae3f8030d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7472153-3dd1-409a-a6f2-c58ae3f8030d
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7472153-3dd1-409a-a6f2-c58ae3f8030d
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-a7472153-3dd1-409a-a6f2-c58ae3f8030d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fdb333b1-2b2f-4f6a-b11d-f2902c2313b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdb333b1-2b2f-4f6a-b11d-f2902c2313b0
Content-Type: application/json

--- request body ---
{"handle":"qa-b08b179f5e44","password":"****"}

--- response: 200 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdb333b1-2b2f-4f6a-b11d-f2902c2313b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9fe33675-8f38-4cc9-8ea3-767ef723573e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d0febdd1-9ec7-4e77-b00d-2016e4a2030c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0febdd1-9ec7-4e77-b00d-2016e4a2030c
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d0febdd1-9ec7-4e77-b00d-2016e4a2030c
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
correlation: qa-cc23ded2-2b9d-4aa8-a61f-b8a817b455c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc23ded2-2b9d-4aa8-a61f-b8a817b455c1
Content-Type: application/json

--- request body ---
{"handle":"qa-b08b179f5e44","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc23ded2-2b9d-4aa8-a61f-b8a817b455c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cc23ded2-2b9d-4aa8-a61f-b8a817b455c1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c03df48-a96c-4ff4-996c-10511bf2783c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c03df48-a96c-4ff4-996c-10511bf2783c
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c03df48-a96c-4ff4-996c-10511bf2783c
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
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-3dd8eb04-ae43-4517-b06f-f1719bcfd105

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dd8eb04-ae43-4517-b06f-f1719bcfd105
Content-Type: application/json

--- request body ---
{"handle":"qa-70f484ad014b","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3dd8eb04-ae43-4517-b06f-f1719bcfd105
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3dd8eb04-ae43-4517-b06f-f1719bcfd105"}
```
