# Transcript: Account, token and public profile match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#accountResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01, FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-fd848e34-4507-4c4b-8f42-90637c3d549b` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-4d3bce86-e932-469f-882c-8c097266970a` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-4aca067f-71f2-4129-b528-84bbb38e5146` |
| 4 | `POST /v1/auth/token` | 200 | 12 | `qa-58196672-70f3-4639-8468-a90d15bcda50` |
| 5 | `GET /v1/accounts/me` | 200 | 9 | `qa-7fa79ed8-06d8-4f42-9b48-4004d59c8b8b` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 17 | `qa-b21fc6b2-c181-433a-8c9f-0aaddfa21f46` |
| 7 | `POST /v1/auth/token` | 200 | 17 | `qa-c19a2b2a-19d5-493c-ab50-89b9c388bcb8` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-9d9b2d5a-d4b9-4147-9180-b0aa564f0841` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-873c6651-c510-4fba-9ba2-34addbd20326` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-ac4c28ab-4622-4803-aca5-bc46465d21bb` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-547ecb59-c742-4a7f-b3de-879c7d1ba76b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fd848e34-4507-4c4b-8f42-90637c3d549b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd848e34-4507-4c4b-8f42-90637c3d549b
Content-Type: application/json

--- request body ---
{"handle":"qa-1d05cef60bab","displayName":"QA 1d05cef60bab","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd848e34-4507-4c4b-8f42-90637c3d549b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Location: /v1/accounts/qa-1d05cef60bab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0928b84e-edec-4f2a-be4e-472011eb89d2","handle":"qa-1d05cef60bab","displayName":"QA 1d05cef60bab","region":"eu","role":"user","createdAt":"2026-11-27T10:59:55.120607722Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4d3bce86-e932-469f-882c-8c097266970a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d3bce86-e932-469f-882c-8c097266970a
Content-Type: application/json

--- request body ---
{"handle":"qa-8c5547590b84","displayName":"QA 8c5547590b84","password":"****","region":"us"}

--- response: 201 in 18 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d3bce86-e932-469f-882c-8c097266970a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Location: /v1/accounts/qa-8c5547590b84
X-Served-Region: us
Content-Length: 181

{"id":"acc_c89fccda-0487-4b68-ba00-7b3e51a14080","handle":"qa-8c5547590b84","displayName":"QA 8c5547590b84","region":"us","role":"user","createdAt":"2026-11-27T10:59:55.148913704Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4aca067f-71f2-4129-b528-84bbb38e5146

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aca067f-71f2-4129-b528-84bbb38e5146
Content-Type: application/json

--- request body ---
{"handle":"qa-1d05cef60bab","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-4aca067f-71f2-4129-b528-84bbb38e5146
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0928b84e-edec-4f2a-be4e-472011eb89d2"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-58196672-70f3-4639-8468-a90d15bcda50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58196672-70f3-4639-8468-a90d15bcda50
Content-Type: application/json

--- request body ---
{"handle":"qa-1d05cef60bab","password":"****"}

--- response: 200 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-58196672-70f3-4639-8468-a90d15bcda50
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0928b84e-edec-4f2a-be4e-472011eb89d2"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-7fa79ed8-06d8-4f42-9b48-4004d59c8b8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fa79ed8-06d8-4f42-9b48-4004d59c8b8b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fa79ed8-06d8-4f42-9b48-4004d59c8b8b
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
Content-Length: 181

{"id":"acc_0928b84e-edec-4f2a-be4e-472011eb89d2","handle":"qa-1d05cef60bab","displayName":"QA 1d05cef60bab","region":"eu","role":"user","createdAt":"2026-11-27T10:59:55.120607722Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-8c5547590b84
correlation: qa-b21fc6b2-c181-433a-8c9f-0aaddfa21f46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b21fc6b2-c181-433a-8c9f-0aaddfa21f46
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-b21fc6b2-c181-433a-8c9f-0aaddfa21f46
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
Content-Length: 74

{"handle":"qa-8c5547590b84","displayName":"QA 8c5547590b84","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-c19a2b2a-19d5-493c-ab50-89b9c388bcb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c19a2b2a-19d5-493c-ab50-89b9c388bcb8
Content-Type: application/json

--- request body ---
{"handle":"qa-8c5547590b84","password":"****"}

--- response: 200 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-c19a2b2a-19d5-493c-ab50-89b9c388bcb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c89fccda-0487-4b68-ba00-7b3e51a14080"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9d9b2d5a-d4b9-4147-9180-b0aa564f0841

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d9b2d5a-d4b9-4147-9180-b0aa564f0841
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9d9b2d5a-d4b9-4147-9180-b0aa564f0841
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
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-873c6651-c510-4fba-9ba2-34addbd20326

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-873c6651-c510-4fba-9ba2-34addbd20326
Content-Type: application/json

--- request body ---
{"handle":"qa-8c5547590b84","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-873c6651-c510-4fba-9ba2-34addbd20326
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-873c6651-c510-4fba-9ba2-34addbd20326"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ac4c28ab-4622-4803-aca5-bc46465d21bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac4c28ab-4622-4803-aca5-bc46465d21bb
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ac4c28ab-4622-4803-aca5-bc46465d21bb
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-547ecb59-c742-4a7f-b3de-879c7d1ba76b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-547ecb59-c742-4a7f-b3de-879c7d1ba76b
Content-Type: application/json

--- request body ---
{"handle":"qa-1d05cef60bab","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 27 Nov 2026 10:59:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-547ecb59-c742-4a7f-b3de-879c7d1ba76b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-547ecb59-c742-4a7f-b3de-879c7d1ba76b"}
```
