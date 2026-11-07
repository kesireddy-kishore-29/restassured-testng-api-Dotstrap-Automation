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
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-8be405f1-2a3e-44a9-8a2f-251bdeefc286` |
| 2 | `POST /v1/accounts` | 201 | 63 | `qa-eaec886b-bef9-45d7-8082-529d1eb0b4a1` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-3296e92b-403a-4d4e-a6aa-335ee6e6257c` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-ecdd59c7-4b10-40db-8489-8b86a108d9e6` |
| 5 | `POST /v1/conversations` | 415 | 18 | `qa-90339398-dcca-4651-bd44-739ef01f9688` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-b0809972-e4b7-4937-8abb-907942e1d3f0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-bc220bb0-92a4-4b5e-a995-a539d00b4f40` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-839e31b8-50aa-443e-86f9-af15b3e645e7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-72e70f7b-1c2e-476a-b9a2-0dbb93570da7` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-046f2cc5-8c1b-4162-9173-956db043987d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8be405f1-2a3e-44a9-8a2f-251bdeefc286

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8be405f1-2a3e-44a9-8a2f-251bdeefc286
Content-Type: application/json

--- request body ---
{"handle":"qa-90cee53a6767","displayName":"QA 90cee53a6767","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-8be405f1-2a3e-44a9-8a2f-251bdeefc286
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Location: /v1/accounts/qa-90cee53a6767
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ef489e89-911c-40b3-90d1-e4f30f560e72","handle":"qa-90cee53a6767","displayName":"QA 90cee53a6767","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.535565635Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eaec886b-bef9-45d7-8082-529d1eb0b4a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaec886b-bef9-45d7-8082-529d1eb0b4a1
Content-Type: application/json

--- request body ---
{"handle":"qa-76eb202271d7","displayName":"QA 76eb202271d7","password":"****","region":"eu"}

--- response: 201 in 63 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaec886b-bef9-45d7-8082-529d1eb0b4a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 7
Location: /v1/accounts/qa-76eb202271d7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5eb82851-bf25-43ab-87ec-8dcb56637982","handle":"qa-76eb202271d7","displayName":"QA 76eb202271d7","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.599268701Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3296e92b-403a-4d4e-a6aa-335ee6e6257c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3296e92b-403a-4d4e-a6aa-335ee6e6257c
Content-Type: application/json

--- request body ---
{"handle":"qa-90cee53a6767","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3296e92b-403a-4d4e-a6aa-335ee6e6257c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ef489e89-911c-40b3-90d1-e4f30f560e72"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ecdd59c7-4b10-40db-8489-8b86a108d9e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecdd59c7-4b10-40db-8489-8b86a108d9e6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-76eb202271d7","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecdd59c7-4b10-40db-8489-8b86a108d9e6
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
Location: /v1/conversations/cnv_8c3091a4-4ee5-44ce-a982-c1c9ed0dc32c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8c3091a4-4ee5-44ce-a982-c1c9ed0dc32c","subject":"Error contract","status":"open","region":"eu","participants":["qa-90cee53a6767","qa-76eb202271d7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:00.676852053Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-90339398-dcca-4651-bd44-739ef01f9688

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90339398-dcca-4651-bd44-739ef01f9688
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90339398-dcca-4651-bd44-739ef01f9688
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-90339398-dcca-4651-bd44-739ef01f9688"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b0809972-e4b7-4937-8abb-907942e1d3f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0809972-e4b7-4937-8abb-907942e1d3f0
Content-Type: application/json

--- request body ---
{"handle":"qa-76eb202271d7","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0809972-e4b7-4937-8abb-907942e1d3f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5eb82851-bf25-43ab-87ec-8dcb56637982"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bc220bb0-92a4-4b5e-a995-a539d00b4f40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc220bb0-92a4-4b5e-a995-a539d00b4f40
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bc220bb0-92a4-4b5e-a995-a539d00b4f40
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
correlation: qa-839e31b8-50aa-443e-86f9-af15b3e645e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-839e31b8-50aa-443e-86f9-af15b3e645e7
Content-Type: application/json

--- request body ---
{"handle":"qa-76eb202271d7","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-839e31b8-50aa-443e-86f9-af15b3e645e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-839e31b8-50aa-443e-86f9-af15b3e645e7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-72e70f7b-1c2e-476a-b9a2-0dbb93570da7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72e70f7b-1c2e-476a-b9a2-0dbb93570da7
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-72e70f7b-1c2e-476a-b9a2-0dbb93570da7
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
correlation: qa-046f2cc5-8c1b-4162-9173-956db043987d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-046f2cc5-8c1b-4162-9173-956db043987d
Content-Type: application/json

--- request body ---
{"handle":"qa-90cee53a6767","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-046f2cc5-8c1b-4162-9173-956db043987d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-046f2cc5-8c1b-4162-9173-956db043987d"}
```
