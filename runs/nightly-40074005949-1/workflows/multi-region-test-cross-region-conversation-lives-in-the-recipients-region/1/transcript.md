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
| 1 | `POST /v1/accounts` | 201 | 476 | `qa-75063ffd-329d-4f41-8e48-1cceb56b2530` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-32f4e735-c7fb-40c1-9bd8-b565c42c9b83` |
| 3 | `POST /v1/auth/token` | 200 | 55 | `qa-eca19989-bad3-4b3a-b934-f6c80388d6a6` |
| 4 | `POST /v1/conversations` | 201 | 71 | `qa-6a6b1c3c-edd9-40cf-b743-234832280c9d` |
| 5 | `GET /v1/conversations/{id}` | 200 | 41 | `qa-f75d27f7-ee8d-44ac-9648-80aa6118399d` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-adcb473f-24e9-4018-b85e-5385bb28ca07` |
| 7 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-a8b192c0-aad8-4387-aa7a-97f5e3900e8a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-56674788-cec0-457e-b59c-7ae5917a8f60` |
| 9 | `POST /v1/auth/token` | 401 | 35 | `qa-93fdddaa-41e1-441c-9c6e-bb41fc0f5838` |
| 10 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-b40c610f-b744-48f4-8beb-dd33d5334f6b` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-51302b82-1a22-4b92-87a8-991997406b8d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-75063ffd-329d-4f41-8e48-1cceb56b2530

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75063ffd-329d-4f41-8e48-1cceb56b2530
Content-Type: application/json

--- request body ---
{"handle":"qa-12e42616d07f","displayName":"QA 12e42616d07f","password":"****","region":"in"}

--- response: 201 in 476 ms ---
Date: Sat, 24 Oct 2026 07:25:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-75063ffd-329d-4f41-8e48-1cceb56b2530
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-12e42616d07f
X-Served-Region: in
Content-Length: 181

{"id":"acc_fc855479-c402-44d3-8f80-080104ae2f71","handle":"qa-12e42616d07f","displayName":"QA 12e42616d07f","region":"in","role":"user","createdAt":"2026-10-24T07:25:34.801163819Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-32f4e735-c7fb-40c1-9bd8-b565c42c9b83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32f4e735-c7fb-40c1-9bd8-b565c42c9b83
Content-Type: application/json

--- request body ---
{"handle":"qa-0f23faa92dfd","displayName":"QA 0f23faa92dfd","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-32f4e735-c7fb-40c1-9bd8-b565c42c9b83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-0f23faa92dfd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_090c6037-abe0-4d38-9488-944ed576030c","handle":"qa-0f23faa92dfd","displayName":"QA 0f23faa92dfd","region":"eu","role":"user","createdAt":"2026-10-24T07:25:35.350736506Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-eca19989-bad3-4b3a-b934-f6c80388d6a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eca19989-bad3-4b3a-b934-f6c80388d6a6
Content-Type: application/json

--- request body ---
{"handle":"qa-12e42616d07f","password":"****"}

--- response: 200 in 55 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-eca19989-bad3-4b3a-b934-f6c80388d6a6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fc855479-c402-44d3-8f80-080104ae2f71"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6a6b1c3c-edd9-40cf-b743-234832280c9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a6b1c3c-edd9-40cf-b743-234832280c9d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0f23faa92dfd","subject":"Across regions","message":"Namaste"}

--- response: 201 in 71 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a6b1c3c-edd9-40cf-b743-234832280c9d
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
Location: /v1/conversations/cnv_34b44c45-9360-4ed9-a93c-41278fd0805c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_34b44c45-9360-4ed9-a93c-41278fd0805c","subject":"Across regions","status":"open","region":"eu","participants":["qa-12e42616d07f","qa-0f23faa92dfd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:35.650588686Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_34b44c45-9360-4ed9-a93c-41278fd0805c
correlation: qa-f75d27f7-ee8d-44ac-9648-80aa6118399d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f75d27f7-ee8d-44ac-9648-80aa6118399d
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f75d27f7-ee8d-44ac-9648-80aa6118399d
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

{"id":"cnv_34b44c45-9360-4ed9-a93c-41278fd0805c","subject":"Across regions","status":"open","region":"eu","participants":["qa-12e42616d07f","qa-0f23faa92dfd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:35.650588686Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-adcb473f-24e9-4018-b85e-5385bb28ca07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adcb473f-24e9-4018-b85e-5385bb28ca07
Content-Type: application/json

--- request body ---
{"handle":"qa-0f23faa92dfd","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-adcb473f-24e9-4018-b85e-5385bb28ca07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_090c6037-abe0-4d38-9488-944ed576030c"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_34b44c45-9360-4ed9-a93c-41278fd0805c
correlation: qa-a8b192c0-aad8-4387-aa7a-97f5e3900e8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8b192c0-aad8-4387-aa7a-97f5e3900e8a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8b192c0-aad8-4387-aa7a-97f5e3900e8a
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

{"id":"cnv_34b44c45-9360-4ed9-a93c-41278fd0805c","subject":"Across regions","status":"open","region":"eu","participants":["qa-12e42616d07f","qa-0f23faa92dfd"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-24T07:25:35.650588686Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-56674788-cec0-457e-b59c-7ae5917a8f60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56674788-cec0-457e-b59c-7ae5917a8f60
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-56674788-cec0-457e-b59c-7ae5917a8f60
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
correlation: qa-93fdddaa-41e1-441c-9c6e-bb41fc0f5838

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93fdddaa-41e1-441c-9c6e-bb41fc0f5838
Content-Type: application/json

--- request body ---
{"handle":"qa-0f23faa92dfd","password":"****"}

--- response: 401 in 35 ms ---
Date: Sat, 24 Oct 2026 07:25:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93fdddaa-41e1-441c-9c6e-bb41fc0f5838
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93fdddaa-41e1-441c-9c6e-bb41fc0f5838"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b40c610f-b744-48f4-8beb-dd33d5334f6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b40c610f-b744-48f4-8beb-dd33d5334f6b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b40c610f-b744-48f4-8beb-dd33d5334f6b
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
correlation: qa-51302b82-1a22-4b92-87a8-991997406b8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51302b82-1a22-4b92-87a8-991997406b8d
Content-Type: application/json

--- request body ---
{"handle":"qa-12e42616d07f","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51302b82-1a22-4b92-87a8-991997406b8d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-51302b82-1a22-4b92-87a8-991997406b8d"}
```
