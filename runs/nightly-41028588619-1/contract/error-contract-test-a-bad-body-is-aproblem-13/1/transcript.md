# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-1357b9cd-ff8a-4683-a048-c0b65d49de7c` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-e88ce48c-0114-4fc4-9a13-0bf14806c37e` |
| 3 | `POST /v1/auth/token` | 200 | 55 | `qa-9ad2633d-0a5a-4e5f-8b94-bc2e23614641` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-dc1e7bc1-883f-4a1a-8abb-4ec552348985` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 30 | `qa-2ad8ca33-4c9a-4b91-97a5-f5630b98cf50` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-cafaa3cb-ac08-4fe5-928b-460975628ca6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-7799257a-41fa-419a-bb72-616878047b89` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-b25fcda2-f57f-4044-a511-bedfa8d10557` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-e3269721-482f-449e-b1ec-e1aff11d3dbe` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-cefe3462-7454-4b85-a34c-9b79ea7bc236` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1357b9cd-ff8a-4683-a048-c0b65d49de7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1357b9cd-ff8a-4683-a048-c0b65d49de7c
Content-Type: application/json

--- request body ---
{"handle":"qa-0fbb3693a765","displayName":"QA 0fbb3693a765","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1357b9cd-ff8a-4683-a048-c0b65d49de7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 7
Location: /v1/accounts/qa-0fbb3693a765
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b2a700f5-97e1-484c-ad7c-dc5cf560b7c4","handle":"qa-0fbb3693a765","displayName":"QA 0fbb3693a765","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.012498152Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e88ce48c-0114-4fc4-9a13-0bf14806c37e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e88ce48c-0114-4fc4-9a13-0bf14806c37e
Content-Type: application/json

--- request body ---
{"handle":"qa-6fb1c8fbb367","displayName":"QA 6fb1c8fbb367","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e88ce48c-0114-4fc4-9a13-0bf14806c37e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 7
Location: /v1/accounts/qa-6fb1c8fbb367
X-Served-Region: eu
Content-Length: 181

{"id":"acc_250da33c-784c-4e85-9a05-f554a5257237","handle":"qa-6fb1c8fbb367","displayName":"QA 6fb1c8fbb367","region":"eu","role":"user","createdAt":"2026-10-30T08:46:05.060858573Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9ad2633d-0a5a-4e5f-8b94-bc2e23614641

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ad2633d-0a5a-4e5f-8b94-bc2e23614641
Content-Type: application/json

--- request body ---
{"handle":"qa-0fbb3693a765","password":"****"}

--- response: 200 in 55 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ad2633d-0a5a-4e5f-8b94-bc2e23614641
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b2a700f5-97e1-484c-ad7c-dc5cf560b7c4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-dc1e7bc1-883f-4a1a-8abb-4ec552348985

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc1e7bc1-883f-4a1a-8abb-4ec552348985
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6fb1c8fbb367","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc1e7bc1-883f-4a1a-8abb-4ec552348985
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
Location: /v1/conversations/cnv_8e5539b2-1227-4e20-9269-aa0eec4cb468
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8e5539b2-1227-4e20-9269-aa0eec4cb468","subject":"Error contract","status":"open","region":"eu","participants":["qa-0fbb3693a765","qa-6fb1c8fbb367"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:05.200552786Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_8e5539b2-1227-4e20-9269-aa0eec4cb468/messages
correlation: qa-2ad8ca33-4c9a-4b91-97a5-f5630b98cf50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ad8ca33-4c9a-4b91-97a5-f5630b98cf50
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 30 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ad8ca33-4c9a-4b91-97a5-f5630b98cf50
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_8e5539b2-1227-4e20-9269-aa0eec4cb468/messages","correlationId":"qa-2ad8ca33-4c9a-4b91-97a5-f5630b98cf50"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cafaa3cb-ac08-4fe5-928b-460975628ca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cafaa3cb-ac08-4fe5-928b-460975628ca6
Content-Type: application/json

--- request body ---
{"handle":"qa-6fb1c8fbb367","password":"****"}

--- response: 200 in 51 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-cafaa3cb-ac08-4fe5-928b-460975628ca6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_250da33c-784c-4e85-9a05-f554a5257237"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7799257a-41fa-419a-bb72-616878047b89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7799257a-41fa-419a-bb72-616878047b89
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7799257a-41fa-419a-bb72-616878047b89
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
correlation: qa-b25fcda2-f57f-4044-a511-bedfa8d10557

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b25fcda2-f57f-4044-a511-bedfa8d10557
Content-Type: application/json

--- request body ---
{"handle":"qa-6fb1c8fbb367","password":"****"}

--- response: 401 in 23 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b25fcda2-f57f-4044-a511-bedfa8d10557
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b25fcda2-f57f-4044-a511-bedfa8d10557"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3269721-482f-449e-b1ec-e1aff11d3dbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3269721-482f-449e-b1ec-e1aff11d3dbe
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3269721-482f-449e-b1ec-e1aff11d3dbe
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
correlation: qa-cefe3462-7454-4b85-a34c-9b79ea7bc236

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cefe3462-7454-4b85-a34c-9b79ea7bc236
Content-Type: application/json

--- request body ---
{"handle":"qa-0fbb3693a765","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cefe3462-7454-4b85-a34c-9b79ea7bc236
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cefe3462-7454-4b85-a34c-9b79ea7bc236"}
```
