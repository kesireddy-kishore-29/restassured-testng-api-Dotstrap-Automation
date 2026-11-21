# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 84 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 274 | `qa-5ab63dd7-04fa-486a-8295-db5309319ecb` |
| 2 | `POST /v1/auth/token` | 200 | 46 | `qa-32415e03-487b-4b34-a897-1c9ba2b596d2` |
| 3 | `GET /v1/accounts/me` | 200 | 36 | `qa-8b40f5a2-dcbb-4917-9627-5cdb92f78650` |
| 4 | `GET /v1/accounts/me` | 200 | 12 | `qa-b2be0f3c-2c7b-4120-bc1a-3ee2a08ff50e` |
| 5 | `GET /v1/accounts/me` | 200 | 11 | `qa-89b6eadb-0f2c-4f8e-8de6-bef9649eb185` |
| 6 | `GET /v1/accounts/me` | 200 | 7 | `qa-f35753f8-706a-4951-804c-433162173028` |
| 7 | `GET /v1/accounts/me` | 200 | 9 | `qa-90de001d-578d-4907-8ac0-80e4e2d1806f` |
| 8 | `GET /v1/accounts/me` | 200 | 11 | `qa-bd9eaf89-f56c-4c6d-9213-2de0dfca4770` |
| 9 | `GET /v1/accounts/me` | 200 | 13 | `qa-1d98e2cb-9ad7-44a3-9f3d-f8d8d831495f` |
| 10 | `GET /v1/accounts/me` | 200 | 5 | `qa-12c615a9-39c0-4095-bb83-7969bac02a3e` |
| 11 | `GET /v1/accounts/me` | 200 | 9 | `qa-1fe0bd34-af80-455f-a254-aa6d873c0702` |
| 12 | `GET /v1/accounts/me` | 200 | 10 | `qa-c409f9c8-3c8b-49ec-bec7-8ff4fd40d445` |
| 13 | `GET /v1/accounts/me` | 200 | 5 | `qa-e5a8e135-1599-41a3-935d-547e417e531d` |
| 14 | `GET /v1/accounts/me` | 200 | 10 | `qa-c69c3513-ca55-4d16-941e-ea1961028772` |
| 15 | `GET /v1/accounts/me` | 200 | 12 | `qa-7d09f601-f553-4e8f-b292-be469081a61c` |
| 16 | `GET /v1/accounts/me` | 200 | 6 | `qa-a059a75f-b437-4de3-a240-c36f630a1d97` |
| 17 | `GET /v1/accounts/me` | 200 | 13 | `qa-9d4bde68-547f-49e5-805a-1b788524c505` |
| 18 | `GET /v1/accounts/me` | 200 | 9 | `qa-fbcb229c-c25b-460e-9916-11921aa35b0b` |
| 19 | `GET /v1/accounts/me` | 200 | 9 | `qa-374b76ee-773d-4a31-bc93-b1b812d921c5` |
| 20 | `GET /v1/accounts/me` | 200 | 8 | `qa-f5431794-0a5b-44a3-b16a-5a69eef2de3f` |
| 21 | `GET /v1/accounts/me` | 200 | 11 | `qa-1df7f7f6-23c2-4a82-9c71-544d5b9b6abf` |
| 22 | `GET /v1/accounts/me` | 200 | 11 | `qa-be3f2090-ae3d-4c9a-8054-39267c9c8e5a` |
| 23 | `GET /v1/accounts/me` | 200 | 4 | `qa-b8d2db5b-4d2d-4eb8-af16-094ec3b115ba` |
| 24 | `GET /v1/accounts/me` | 200 | 4 | `qa-082f7182-7296-4063-a926-96a03fe73e27` |
| 25 | `GET /v1/accounts/me` | 200 | 7 | `qa-a772f33e-6806-4b95-b214-7d445fca9a48` |
| 26 | `GET /v1/accounts/me` | 200 | 5 | `qa-bbd5b7a8-bede-448e-998d-2321db4c3a1d` |
| 27 | `GET /v1/accounts/me` | 200 | 6 | `qa-07a7a92c-f83d-40f7-afa3-a6b0cb763a83` |
| 28 | `GET /v1/accounts/me` | 200 | 7 | `qa-ea534568-787c-4ba9-82e0-24c81eab58f5` |
| 29 | `GET /v1/accounts/me` | 200 | 5 | `qa-503377c1-4e79-4882-bf5c-20ae0f63c086` |
| 30 | `GET /v1/accounts/me` | 200 | 6 | `qa-30f5a1e9-0f4d-4015-aa29-5838b96a25db` |
| 31 | `GET /v1/accounts/me` | 200 | 7 | `qa-25b540a3-2979-4886-b7b1-1c0833342ba7` |
| 32 | `GET /v1/accounts/me` | 200 | 4 | `qa-aca91082-4ed2-417b-9672-9ff534ae3def` |
| 33 | `GET /v1/accounts/me` | 200 | 4 | `qa-2ffe9cc6-ed73-4183-b650-b648cbc392e6` |
| 34 | `GET /v1/accounts/me` | 200 | 5 | `qa-df8462c1-4c87-4e64-9ffa-d16918f80e47` |
| 35 | `GET /v1/accounts/me` | 200 | 10 | `qa-42620c5c-845f-4da8-92f2-d1a3a209e1e1` |
| 36 | `GET /v1/accounts/me` | 200 | 4 | `qa-f8e9d35d-08c8-4206-bcc5-fcbb72d29886` |
| 37 | `GET /v1/accounts/me` | 200 | 7 | `qa-44e381e1-5178-464a-934d-c8dcbfd300fe` |
| 38 | `GET /v1/accounts/me` | 200 | 5 | `qa-dd51329c-d00b-4cbc-ae07-92870efd075a` |
| 39 | `GET /v1/accounts/me` | 200 | 4 | `qa-9df163f8-dcfe-457e-9f1e-703ead2da656` |
| 40 | `GET /v1/accounts/me` | 200 | 10 | `qa-30fe7e10-f77d-4040-97e4-ef701588f90c` |
| 41 | `GET /v1/accounts/me` | 200 | 7 | `qa-db12c84f-e005-40a9-97ee-d51e70a98f3f` |
| 42 | `GET /v1/accounts/me` | 200 | 7 | `qa-b7e6ba71-2d27-4310-9031-5bdbaa58e08d` |
| 43 | `GET /v1/accounts/me` | 200 | 8 | `qa-9b2b6e69-b360-4a1f-828e-c7eccb3caecd` |
| 44 | `GET /v1/accounts/me` | 200 | 5 | `qa-1f53b029-f28c-451f-858b-aabaf2844fc8` |
| 45 | `GET /v1/accounts/me` | 200 | 6 | `qa-9fea6d73-2781-4774-8046-6a218de48ddd` |
| 46 | `GET /v1/accounts/me` | 200 | 5 | `qa-0d19b61a-0593-44ac-8a87-3349606ebc2c` |
| 47 | `GET /v1/accounts/me` | 200 | 10 | `qa-7c58b7df-1eaf-44ed-9d92-bc522b8ed09e` |
| 48 | `GET /v1/accounts/me` | 200 | 4 | `qa-dc33dbe5-c154-491e-af19-db3f5ddfeb25` |
| 49 | `GET /v1/accounts/me` | 200 | 5 | `qa-18eae19a-3709-4f59-862e-d29ecd828158` |
| 50 | `GET /v1/accounts/me` | 200 | 7 | `qa-0fee04d8-017d-4c6a-b0e8-b5664ad04a24` |
| 51 | `GET /v1/accounts/me` | 200 | 7 | `qa-1a98e7cd-0fed-4cc2-adb0-8063e98691dd` |
| 52 | `GET /v1/accounts/me` | 200 | 5 | `qa-8f17cdd1-698a-4e47-9b7c-4c5bfc62c4ef` |
| 53 | `GET /v1/accounts/me` | 200 | 3 | `qa-a6e403d2-8713-4b98-8d3e-493ba0c03a08` |
| 54 | `GET /v1/accounts/me` | 200 | 5 | `qa-1ea29641-e370-4559-8429-738af261ff8f` |
| 55 | `GET /v1/accounts/me` | 200 | 7 | `qa-e30abf8e-cb1b-445a-80c6-1344cb6b5e12` |
| 56 | `GET /v1/accounts/me` | 200 | 4 | `qa-f0a98a34-6025-47a8-9746-7524d2555dfc` |
| 57 | `GET /v1/accounts/me` | 200 | 11 | `qa-2cf0639d-2c14-4101-8477-fe45bd7ab916` |
| 58 | `GET /v1/accounts/me` | 200 | 5 | `qa-364b9cb4-344e-400c-9b25-edb9567222c1` |
| 59 | `GET /v1/accounts/me` | 200 | 5 | `qa-8dd3dbfb-cf94-4cbf-9043-0929361b494f` |
| 60 | `GET /v1/accounts/me` | 200 | 4 | `qa-7c852cd9-cecd-4e9a-92b8-1712f8c2ed09` |
| 61 | `GET /v1/accounts/me` | 200 | 5 | `qa-71026f63-4e4c-4c11-805b-a90dc8ca91bc` |
| 62 | `GET /v1/accounts/me` | 200 | 6 | `qa-3dad80df-3907-4b9b-a41e-3de944deb961` |
| 63 | `GET /v1/accounts/me` | 429 | 4 | `qa-0ca19736-b14c-4fe7-a509-4e7187165dd3` |
| 64 | `GET /v1/accounts/me` | 429 | 4 | `qa-3efd5c82-23b3-4d22-9c30-48cf68a98914` |
| 65 | `GET /v1/accounts/me` | 429 | 4 | `qa-bf7002d3-2bba-4223-94f7-0ac0d85656f6` |
| 66 | `GET /v1/accounts/me` | 429 | 3 | `qa-9c70254d-7fb6-430a-b265-a1f0c822b27b` |
| 67 | `GET /v1/accounts/me` | 429 | 3 | `qa-e2f7d774-7cd7-437a-8c24-c50914b5a3f4` |
| 68 | `GET /v1/accounts/me` | 429 | 5 | `qa-4b80c236-7c24-4220-a9a7-740e66b64959` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-96318a8f-ff11-4664-a450-11af50db21b3` |
| 70 | `GET /v1/accounts/me` | 429 | 3 | `qa-be6bca62-8668-4d52-909c-fdddde6b2464` |
| 71 | `GET /v1/accounts/me` | 429 | 3 | `qa-5463ab71-2be8-409d-a586-3fb24d066ac2` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-ccee001e-dddb-43f7-8aec-16d38a45f478` |
| 73 | `GET /v1/accounts/me` | 429 | 3 | `qa-310b5df7-b715-478f-8202-5fe82b4f10b0` |
| 74 | `GET /v1/accounts/me` | 429 | 3 | `qa-9864ce46-b5f8-4bb5-aa1d-08907c978e75` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-1afd20dd-a583-4f57-b836-bddb056398c6` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-ba0ea9da-7f5e-4616-9882-99cdbc28f438` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-fc885570-bdaa-488a-8171-df372cacbe85` |
| 78 | `GET /v1/accounts/me` | 429 | 3 | `qa-49c52323-c72c-4846-b77a-ad0999671b64` |
| 79 | `GET /v1/accounts/me` | 429 | 3 | `qa-aa57c545-ba53-4469-bf9b-08d2d1883b6f` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-bbb1e3c1-e490-42a0-9823-070e2884a256` |
| 81 | `GET /v1/accounts/me` | 429 | 3 | `qa-f3791d60-1da1-4934-b20a-e1e87f68d3b0` |
| 82 | `GET /v1/accounts/me` | 200 | 3 | `qa-faed4701-5947-4424-807a-b54852816e36` |
| 83 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-45a6e151-0ada-4b5b-9d9b-23a5bccb9cb3` |
| 84 | `POST /v1/auth/token` | 401 | 3 | `qa-482bb76c-3471-4e7b-a38f-4e393f5df4f8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5ab63dd7-04fa-486a-8295-db5309319ecb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ab63dd7-04fa-486a-8295-db5309319ecb
Content-Type: application/json

--- request body ---
{"handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","password":"****","region":"eu"}

--- response: 201 in 274 ms ---
Date: Tue, 17 Nov 2026 10:50:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ab63dd7-04fa-486a-8295-db5309319ecb
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
Location: /v1/accounts/qa-636dfdddbc65
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-32415e03-487b-4b34-a897-1c9ba2b596d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32415e03-487b-4b34-a897-1c9ba2b596d2
Content-Type: application/json

--- request body ---
{"handle":"qa-636dfdddbc65","password":"****"}

--- response: 200 in 46 ms ---
Date: Tue, 17 Nov 2026 10:50:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-32415e03-487b-4b34-a897-1c9ba2b596d2
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b40f5a2-dcbb-4917-9627-5cdb92f78650

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b40f5a2-dcbb-4917-9627-5cdb92f78650
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b40f5a2-dcbb-4917-9627-5cdb92f78650
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

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2be0f3c-2c7b-4120-bc1a-3ee2a08ff50e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2be0f3c-2c7b-4120-bc1a-3ee2a08ff50e
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2be0f3c-2c7b-4120-bc1a-3ee2a08ff50e
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
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-89b6eadb-0f2c-4f8e-8de6-bef9649eb185

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89b6eadb-0f2c-4f8e-8de6-bef9649eb185
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-89b6eadb-0f2c-4f8e-8de6-bef9649eb185
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
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-f35753f8-706a-4951-804c-433162173028

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f35753f8-706a-4951-804c-433162173028
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-f35753f8-706a-4951-804c-433162173028
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-90de001d-578d-4907-8ac0-80e4e2d1806f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90de001d-578d-4907-8ac0-80e4e2d1806f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-90de001d-578d-4907-8ac0-80e4e2d1806f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd9eaf89-f56c-4c6d-9213-2de0dfca4770

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd9eaf89-f56c-4c6d-9213-2de0dfca4770
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd9eaf89-f56c-4c6d-9213-2de0dfca4770
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-1d98e2cb-9ad7-44a3-9f3d-f8d8d831495f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d98e2cb-9ad7-44a3-9f3d-f8d8d831495f
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d98e2cb-9ad7-44a3-9f3d-f8d8d831495f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-12c615a9-39c0-4095-bb83-7969bac02a3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12c615a9-39c0-4095-bb83-7969bac02a3e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-12c615a9-39c0-4095-bb83-7969bac02a3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-1fe0bd34-af80-455f-a254-aa6d873c0702

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fe0bd34-af80-455f-a254-aa6d873c0702
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fe0bd34-af80-455f-a254-aa6d873c0702
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-c409f9c8-3c8b-49ec-bec7-8ff4fd40d445

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c409f9c8-3c8b-49ec-bec7-8ff4fd40d445
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-c409f9c8-3c8b-49ec-bec7-8ff4fd40d445
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-e5a8e135-1599-41a3-935d-547e417e531d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5a8e135-1599-41a3-935d-547e417e531d
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5a8e135-1599-41a3-935d-547e417e531d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-c69c3513-ca55-4d16-941e-ea1961028772

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c69c3513-ca55-4d16-941e-ea1961028772
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-c69c3513-ca55-4d16-941e-ea1961028772
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-7d09f601-f553-4e8f-b292-be469081a61c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d09f601-f553-4e8f-b292-be469081a61c
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d09f601-f553-4e8f-b292-be469081a61c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-a059a75f-b437-4de3-a240-c36f630a1d97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a059a75f-b437-4de3-a240-c36f630a1d97
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-a059a75f-b437-4de3-a240-c36f630a1d97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-9d4bde68-547f-49e5-805a-1b788524c505

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d4bde68-547f-49e5-805a-1b788524c505
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d4bde68-547f-49e5-805a-1b788524c505
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-fbcb229c-c25b-460e-9916-11921aa35b0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbcb229c-c25b-460e-9916-11921aa35b0b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbcb229c-c25b-460e-9916-11921aa35b0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-374b76ee-773d-4a31-bc93-b1b812d921c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-374b76ee-773d-4a31-bc93-b1b812d921c5
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-374b76ee-773d-4a31-bc93-b1b812d921c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-f5431794-0a5b-44a3-b16a-5a69eef2de3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5431794-0a5b-44a3-b16a-5a69eef2de3f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5431794-0a5b-44a3-b16a-5a69eef2de3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-1df7f7f6-23c2-4a82-9c71-544d5b9b6abf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1df7f7f6-23c2-4a82-9c71-544d5b9b6abf
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-1df7f7f6-23c2-4a82-9c71-544d5b9b6abf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-be3f2090-ae3d-4c9a-8054-39267c9c8e5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be3f2090-ae3d-4c9a-8054-39267c9c8e5a
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-be3f2090-ae3d-4c9a-8054-39267c9c8e5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-b8d2db5b-4d2d-4eb8-af16-094ec3b115ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8d2db5b-4d2d-4eb8-af16-094ec3b115ba
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8d2db5b-4d2d-4eb8-af16-094ec3b115ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-082f7182-7296-4063-a926-96a03fe73e27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-082f7182-7296-4063-a926-96a03fe73e27
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-082f7182-7296-4063-a926-96a03fe73e27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-a772f33e-6806-4b95-b214-7d445fca9a48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a772f33e-6806-4b95-b214-7d445fca9a48
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-a772f33e-6806-4b95-b214-7d445fca9a48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-bbd5b7a8-bede-448e-998d-2321db4c3a1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbd5b7a8-bede-448e-998d-2321db4c3a1d
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbd5b7a8-bede-448e-998d-2321db4c3a1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-07a7a92c-f83d-40f7-afa3-a6b0cb763a83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07a7a92c-f83d-40f7-afa3-a6b0cb763a83
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-07a7a92c-f83d-40f7-afa3-a6b0cb763a83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-ea534568-787c-4ba9-82e0-24c81eab58f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea534568-787c-4ba9-82e0-24c81eab58f5
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea534568-787c-4ba9-82e0-24c81eab58f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-503377c1-4e79-4882-bf5c-20ae0f63c086

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-503377c1-4e79-4882-bf5c-20ae0f63c086
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-503377c1-4e79-4882-bf5c-20ae0f63c086
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-30f5a1e9-0f4d-4015-aa29-5838b96a25db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30f5a1e9-0f4d-4015-aa29-5838b96a25db
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-30f5a1e9-0f4d-4015-aa29-5838b96a25db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-25b540a3-2979-4886-b7b1-1c0833342ba7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25b540a3-2979-4886-b7b1-1c0833342ba7
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-25b540a3-2979-4886-b7b1-1c0833342ba7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-aca91082-4ed2-417b-9672-9ff534ae3def

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aca91082-4ed2-417b-9672-9ff534ae3def
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-aca91082-4ed2-417b-9672-9ff534ae3def
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-2ffe9cc6-ed73-4183-b650-b648cbc392e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ffe9cc6-ed73-4183-b650-b648cbc392e6
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ffe9cc6-ed73-4183-b650-b648cbc392e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-df8462c1-4c87-4e64-9ffa-d16918f80e47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df8462c1-4c87-4e64-9ffa-d16918f80e47
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-df8462c1-4c87-4e64-9ffa-d16918f80e47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-42620c5c-845f-4da8-92f2-d1a3a209e1e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42620c5c-845f-4da8-92f2-d1a3a209e1e1
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-42620c5c-845f-4da8-92f2-d1a3a209e1e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-f8e9d35d-08c8-4206-bcc5-fcbb72d29886

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8e9d35d-08c8-4206-bcc5-fcbb72d29886
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8e9d35d-08c8-4206-bcc5-fcbb72d29886
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-44e381e1-5178-464a-934d-c8dcbfd300fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44e381e1-5178-464a-934d-c8dcbfd300fe
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-44e381e1-5178-464a-934d-c8dcbfd300fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-dd51329c-d00b-4cbc-ae07-92870efd075a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd51329c-d00b-4cbc-ae07-92870efd075a
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd51329c-d00b-4cbc-ae07-92870efd075a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-9df163f8-dcfe-457e-9f1e-703ead2da656

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9df163f8-dcfe-457e-9f1e-703ead2da656
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-9df163f8-dcfe-457e-9f1e-703ead2da656
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-30fe7e10-f77d-4040-97e4-ef701588f90c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30fe7e10-f77d-4040-97e4-ef701588f90c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-30fe7e10-f77d-4040-97e4-ef701588f90c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-db12c84f-e005-40a9-97ee-d51e70a98f3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db12c84f-e005-40a9-97ee-d51e70a98f3f
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-db12c84f-e005-40a9-97ee-d51e70a98f3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-b7e6ba71-2d27-4310-9031-5bdbaa58e08d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7e6ba71-2d27-4310-9031-5bdbaa58e08d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7e6ba71-2d27-4310-9031-5bdbaa58e08d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b2b6e69-b360-4a1f-828e-c7eccb3caecd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b2b6e69-b360-4a1f-828e-c7eccb3caecd
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b2b6e69-b360-4a1f-828e-c7eccb3caecd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f53b029-f28c-451f-858b-aabaf2844fc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f53b029-f28c-451f-858b-aabaf2844fc8
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f53b029-f28c-451f-858b-aabaf2844fc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-9fea6d73-2781-4774-8046-6a218de48ddd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fea6d73-2781-4774-8046-6a218de48ddd
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fea6d73-2781-4774-8046-6a218de48ddd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d19b61a-0593-44ac-8a87-3349606ebc2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d19b61a-0593-44ac-8a87-3349606ebc2c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d19b61a-0593-44ac-8a87-3349606ebc2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c58b7df-1eaf-44ed-9d92-bc522b8ed09e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c58b7df-1eaf-44ed-9d92-bc522b8ed09e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c58b7df-1eaf-44ed-9d92-bc522b8ed09e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc33dbe5-c154-491e-af19-db3f5ddfeb25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc33dbe5-c154-491e-af19-db3f5ddfeb25
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc33dbe5-c154-491e-af19-db3f5ddfeb25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-18eae19a-3709-4f59-862e-d29ecd828158

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18eae19a-3709-4f59-862e-d29ecd828158
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-18eae19a-3709-4f59-862e-d29ecd828158
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-0fee04d8-017d-4c6a-b0e8-b5664ad04a24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fee04d8-017d-4c6a-b0e8-b5664ad04a24
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fee04d8-017d-4c6a-b0e8-b5664ad04a24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-1a98e7cd-0fed-4cc2-adb0-8063e98691dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a98e7cd-0fed-4cc2-adb0-8063e98691dd
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a98e7cd-0fed-4cc2-adb0-8063e98691dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f17cdd1-698a-4e47-9b7c-4c5bfc62c4ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f17cdd1-698a-4e47-9b7c-4c5bfc62c4ef
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f17cdd1-698a-4e47-9b7c-4c5bfc62c4ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-a6e403d2-8713-4b98-8d3e-493ba0c03a08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6e403d2-8713-4b98-8d3e-493ba0c03a08
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6e403d2-8713-4b98-8d3e-493ba0c03a08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-1ea29641-e370-4559-8429-738af261ff8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ea29641-e370-4559-8429-738af261ff8f
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ea29641-e370-4559-8429-738af261ff8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-e30abf8e-cb1b-445a-80c6-1344cb6b5e12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e30abf8e-cb1b-445a-80c6-1344cb6b5e12
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e30abf8e-cb1b-445a-80c6-1344cb6b5e12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-f0a98a34-6025-47a8-9746-7524d2555dfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0a98a34-6025-47a8-9746-7524d2555dfc
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0a98a34-6025-47a8-9746-7524d2555dfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-2cf0639d-2c14-4101-8477-fe45bd7ab916

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cf0639d-2c14-4101-8477-fe45bd7ab916
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cf0639d-2c14-4101-8477-fe45bd7ab916
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-364b9cb4-344e-400c-9b25-edb9567222c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-364b9cb4-344e-400c-9b25-edb9567222c1
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-364b9cb4-344e-400c-9b25-edb9567222c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-8dd3dbfb-cf94-4cbf-9043-0929361b494f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dd3dbfb-cf94-4cbf-9043-0929361b494f
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-8dd3dbfb-cf94-4cbf-9043-0929361b494f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c852cd9-cecd-4e9a-92b8-1712f8c2ed09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c852cd9-cecd-4e9a-92b8-1712f8c2ed09
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c852cd9-cecd-4e9a-92b8-1712f8c2ed09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-71026f63-4e4c-4c11-805b-a90dc8ca91bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71026f63-4e4c-4c11-805b-a90dc8ca91bc
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-71026f63-4e4c-4c11-805b-a90dc8ca91bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-3dad80df-3907-4b9b-a41e-3de944deb961

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dad80df-3907-4b9b-a41e-3de944deb961
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-3dad80df-3907-4b9b-a41e-3de944deb961
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ca19736-b14c-4fe7-a509-4e7187165dd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ca19736-b14c-4fe7-a509-4e7187165dd3
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ca19736-b14c-4fe7-a509-4e7187165dd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
Retry-After: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 10 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0ca19736-b14c-4fe7-a509-4e7187165dd3"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-3efd5c82-23b3-4d22-9c30-48cf68a98914

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3efd5c82-23b3-4d22-9c30-48cf68a98914
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3efd5c82-23b3-4d22-9c30-48cf68a98914
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3efd5c82-23b3-4d22-9c30-48cf68a98914"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf7002d3-2bba-4223-94f7-0ac0d85656f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf7002d3-2bba-4223-94f7-0ac0d85656f6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf7002d3-2bba-4223-94f7-0ac0d85656f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bf7002d3-2bba-4223-94f7-0ac0d85656f6"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c70254d-7fb6-430a-b265-a1f0c822b27b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c70254d-7fb6-430a-b265-a1f0c822b27b
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c70254d-7fb6-430a-b265-a1f0c822b27b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9c70254d-7fb6-430a-b265-a1f0c822b27b"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-e2f7d774-7cd7-437a-8c24-c50914b5a3f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2f7d774-7cd7-437a-8c24-c50914b5a3f4
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2f7d774-7cd7-437a-8c24-c50914b5a3f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e2f7d774-7cd7-437a-8c24-c50914b5a3f4"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-4b80c236-7c24-4220-a9a7-740e66b64959

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b80c236-7c24-4220-a9a7-740e66b64959
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b80c236-7c24-4220-a9a7-740e66b64959
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4b80c236-7c24-4220-a9a7-740e66b64959"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-96318a8f-ff11-4664-a450-11af50db21b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96318a8f-ff11-4664-a450-11af50db21b3
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96318a8f-ff11-4664-a450-11af50db21b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-96318a8f-ff11-4664-a450-11af50db21b3"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-be6bca62-8668-4d52-909c-fdddde6b2464

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be6bca62-8668-4d52-909c-fdddde6b2464
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be6bca62-8668-4d52-909c-fdddde6b2464
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-be6bca62-8668-4d52-909c-fdddde6b2464"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-5463ab71-2be8-409d-a586-3fb24d066ac2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5463ab71-2be8-409d-a586-3fb24d066ac2
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5463ab71-2be8-409d-a586-3fb24d066ac2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5463ab71-2be8-409d-a586-3fb24d066ac2"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-ccee001e-dddb-43f7-8aec-16d38a45f478

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccee001e-dddb-43f7-8aec-16d38a45f478
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ccee001e-dddb-43f7-8aec-16d38a45f478
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ccee001e-dddb-43f7-8aec-16d38a45f478"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-310b5df7-b715-478f-8202-5fe82b4f10b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-310b5df7-b715-478f-8202-5fe82b4f10b0
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-310b5df7-b715-478f-8202-5fe82b4f10b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-310b5df7-b715-478f-8202-5fe82b4f10b0"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-9864ce46-b5f8-4bb5-aa1d-08907c978e75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9864ce46-b5f8-4bb5-aa1d-08907c978e75
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9864ce46-b5f8-4bb5-aa1d-08907c978e75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9864ce46-b5f8-4bb5-aa1d-08907c978e75"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-1afd20dd-a583-4f57-b836-bddb056398c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1afd20dd-a583-4f57-b836-bddb056398c6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1afd20dd-a583-4f57-b836-bddb056398c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1afd20dd-a583-4f57-b836-bddb056398c6"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-ba0ea9da-7f5e-4616-9882-99cdbc28f438

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba0ea9da-7f5e-4616-9882-99cdbc28f438
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba0ea9da-7f5e-4616-9882-99cdbc28f438
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ba0ea9da-7f5e-4616-9882-99cdbc28f438"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-fc885570-bdaa-488a-8171-df372cacbe85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc885570-bdaa-488a-8171-df372cacbe85
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc885570-bdaa-488a-8171-df372cacbe85
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fc885570-bdaa-488a-8171-df372cacbe85"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-49c52323-c72c-4846-b77a-ad0999671b64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49c52323-c72c-4846-b77a-ad0999671b64
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49c52323-c72c-4846-b77a-ad0999671b64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-49c52323-c72c-4846-b77a-ad0999671b64"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-aa57c545-ba53-4469-bf9b-08d2d1883b6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa57c545-ba53-4469-bf9b-08d2d1883b6f
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa57c545-ba53-4469-bf9b-08d2d1883b6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-aa57c545-ba53-4469-bf9b-08d2d1883b6f"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-bbb1e3c1-e490-42a0-9823-070e2884a256

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbb1e3c1-e490-42a0-9823-070e2884a256
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bbb1e3c1-e490-42a0-9823-070e2884a256
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bbb1e3c1-e490-42a0-9823-070e2884a256"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-f3791d60-1da1-4934-b20a-e1e87f68d3b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3791d60-1da1-4934-b20a-e1e87f68d3b0
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3791d60-1da1-4934-b20a-e1e87f68d3b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f3791d60-1da1-4934-b20a-e1e87f68d3b0"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-faed4701-5947-4424-807a-b54852816e36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faed4701-5947-4424-807a-b54852816e36
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-faed4701-5947-4424-807a-b54852816e36
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

{"id":"acc_147fa00b-d509-4852-ad40-e7fc5fe3c004","handle":"qa-636dfdddbc65","displayName":"QA 636dfdddbc65","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.637481754Z"}
```

## 83. DELETE /v1/accounts/me

```text
#83 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-45a6e151-0ada-4b5b-9d9b-23a5bccb9cb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45a6e151-0ada-4b5b-9d9b-23a5bccb9cb3
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-45a6e151-0ada-4b5b-9d9b-23a5bccb9cb3
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

## 84. POST /v1/auth/token

```text
#84 POST http://localhost:7070/v1/auth/token
correlation: qa-482bb76c-3471-4e7b-a38f-4e393f5df4f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-482bb76c-3471-4e7b-a38f-4e393f5df4f8
Content-Type: application/json

--- request body ---
{"handle":"qa-636dfdddbc65","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-482bb76c-3471-4e7b-a38f-4e393f5df4f8
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-482bb76c-3471-4e7b-a38f-4e393f5df4f8"}
```
